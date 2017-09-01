package com.yuewen.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by duanyixiao on 2017/7/24.
 */
@Service
public class SpringUtils implements ApplicationContextAware {
    private static final Logger logger = LoggerFactory.getLogger(SpringUtils.class);
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(">>>>>>> initial applicationcontext "+(applicationContext!=null?"not null":"null"));
        if (applicationContext != null)
            SpringUtils.applicationContext = applicationContext;
        System.out.println(">>>>>>>> initial end");
    }

    public static Optional<ApplicationContext> getApplicationContext(){
        return Optional.ofNullable(applicationContext);
    }

    public static <T> Optional<T> getBean(Class<T> t){
        return getApplicationContext().map(o->o.getBean(t));
    }
}
