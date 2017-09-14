import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.common.collect.Lists;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.concurrent.CompletionService;

/**
 * Created by duanyixiao on 2017/9/11.
 */
@Data
public class TencentRequest {
    @Data
    private static class Phone{
        private String nationcode;
        private String mobile;
    }

    @JSONField(ordinal = 0)
    private Phone tel;
    @JSONField(ordinal = 1)
    private String sign = "腾讯云";
    @JSONField(ordinal = 2)
    private int tpl_id;
    @JSONField(ordinal = 3)
    private List<String> params;
    @JSONField(ordinal = 4)
    private String sig;
    @JSONField(ordinal = 5)
    private long time;
    @JSONField(ordinal = 6)
    private String extend = "";
    @JSONField(ordinal = 7)
    private String ext = "";


    public static void main(String[] args) {
        String phoneNubmer = "+60176960123";
        int nationcode = 60;
        System.out.println(phoneNubmer.substring(String.valueOf(nationcode).length()+1));


    }

}
