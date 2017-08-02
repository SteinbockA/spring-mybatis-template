package com.yuewen.taf.command;

import com.qq.cloud.taf.support.om.CommandHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by duanyixiao on 2017/7/11.
 */
public class TestCommand implements CommandHandler {
    private static final Logger logger = LoggerFactory.getLogger(TestCommand.class);


    @Override
    public void handle(String s, String s1) {

//        logger.info("<<<< step into handle");
//        try {
//            List<MztCondition> list = mztConditionMapper.getMztConditionList();
//            logger.info("11 list={}", JSON.toJSONString(list));
//        } catch (Exception e) {
//            logger.info("<<<<< e={}", e);
//        }
    }
}
