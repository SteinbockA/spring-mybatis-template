package com.yuewen.util;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanyixiao on 2017/9/1.
 */
public class LogUtils {
    private static final Logger log = LoggerFactory.getLogger(LogUtils.class);

    public static void debug(String s){
        log.debug(s);
    }
    public static void debug(String s,Object ... objects){
        log.debug(s,objects);
    }

    public static void info(String s){
        log.info(s);
    }

    public static void info(String s,Object... objects){
        log.info(s,objects);
    }

    public static void error(String s){
        log.info(s);
    }

    public static void error(String s,Object...objects){
        log.error(s,objects);
    }

    public static void main(String[] args) throws Exception {
        List<Integer> list  = Lists.newArrayList();
        Method method = list.getClass().getMethod("add",Object.class);
        method.invoke(list,"String");
        System.out.println(list);
        
    }
}
