package com.yuewen.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by duanyixiao on 2017/7/25.
 */
@Configuration
@ComponentScan(value = "com.yuewen")
@MapperScan(value = "com.yuewen.mapper")
public class AppConfig {

}
