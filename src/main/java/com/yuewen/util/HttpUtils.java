package com.yuewen.util;

import okhttp3.*;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by duanyixiao on 2017/10/12.
 */
public class HttpUtils {
    private static OkHttpClient client = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(60,TimeUnit.SECONDS).build();

    public static class HttpResult{
        public final int code;
        public final ResponseBody body;
        public String errorMsg;

        HttpResult(int code, ResponseBody body){
            this.code = code;
            this.body = body;
        }

        HttpResult(Throwable throwable){
            this.code = -1;
            this.body = null;
            this.errorMsg = throwable.getMessage();
        }

    }

    public static HttpResult doGet(String url){
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = client.newCall(request).execute();
            return new HttpResult(response.code(), response.body());
        } catch (IOException e) {
            LogUtils.error("doGet() : exception , e={}",e);
            return new HttpResult(e);
        }
    }

    public static HttpResult doPostForm(String url, Map<String,String> params){
        if(CollectionUtils.isEmpty(params))
            return new HttpResult(new IllegalArgumentException("Argument error"));
        FormBody.Builder formBuilder = new FormBody.Builder();
        params.forEach((key,value)->{
            if(key==null || value==null)
                return;
            formBuilder.add(key,value);
        });
        Request request = new Request.Builder().post(formBuilder.build()).build();
        try {
            Response response = client.newCall(request).execute();
            return new HttpResult(response.code(), response.body());
        } catch (IOException e) {
            return new HttpResult(e);
        }
    }
}