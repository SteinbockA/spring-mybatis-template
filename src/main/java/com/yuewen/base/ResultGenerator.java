package com.yuewen.base;

import com.qq.cloud.taf.common.support.Holder;
import com.yuewen.constants.ReturnCons;
import com.yuewen.taf.client.uniteidconvert.servant.CommonOutParam;

import static com.yuewen.constants.ReturnCons.*;


/**
 * Created by duanyixiao on 2017/9/4.
 */
public class ResultGenerator {

    public static void successResult(Object data, Holder<com.yuewen.taf.servant.CommonOutParam> outParamHolder, Holder<Object> holder ) {
        com.yuewen.taf.servant.CommonOutParam outParam = new com.yuewen.taf.servant.CommonOutParam();
        outParam.setCode(SUCCESS.code);
        outParam.setMessage(SUCCESS.toString());
        outParamHolder.setValue(outParam);
        holder.setValue(data);
    }

    public static void partitialSuccessResult(Object data, Holder<com.yuewen.taf.servant.CommonOutParam> outParamHolder, Holder<Object> holder) {
        com.yuewen.taf.servant.CommonOutParam outParam = new com.yuewen.taf.servant.CommonOutParam();
        outParam.setCode(PARTIALSUCC.code);
        outParam.setMessage(PARTIALSUCC.toString());
        holder.setValue(data);
    }

    public static void failResult(String message, Object data, Holder<com.yuewen.taf.servant.CommonOutParam> outParamHolder, Holder<Object> holder) {
        com.yuewen.taf.servant.CommonOutParam outParam = new com.yuewen.taf.servant.CommonOutParam();
        outParam.setCode(FAILED.code);
        outParam.setMessage(message);
        outParamHolder.setValue(outParam);
        holder.setValue(data);
    }

    public static void errorResult(ReturnCons returnCons, Object data, Holder<com.yuewen.taf.servant.CommonOutParam> outParamHolder, Holder<Object> holder){
        com.yuewen.taf.servant.CommonOutParam outParam = new com.yuewen.taf.servant.CommonOutParam();
        outParam.setCode(returnCons.code);
        outParam.setMessage(returnCons.toString());
        outParamHolder.setValue(outParam);
        holder.setValue(data);
    }
}
