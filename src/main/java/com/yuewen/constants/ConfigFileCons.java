package com.yuewen.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by duanyixiao on 2017/7/25.
 */

@Component
@PropertySource(value = "classpath:data.properties")
public class ConfigFileCons {
    @Value("${datasource.url}")
    public String url;
    @Value("${datasource.username}")
    public String username;
    @Value("${datasource.password}")
    public String password;
    @Value("${datasource.driver-class-name}")
    public String driverClassName;
    @Value("${datasource.dbname}")
    public String dbname;
    @Value("${datasource.num}")
    public int num;

}
