package com.yuewen.config;

import com.github.pagehelper.PageInterceptor;
import com.yuewen.util.DynamicDBUtil;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import java.util.Properties;

/**
 * Created by duanyixiao on 2017/8/31.
 */
@Configuration
@PropertySource(value = "classpath:data.properties")
public class DataSourceConfig {
    @Value("${datasource.url}")
    private String url;
    @Value("${datasource.username}")
    private String username;
    @Value("${datasource.password}")
    private String password;
    @Value("${datasource.driver-class-name}")
    private String driverClassName;
    @Value("${datasource.dbname}")
    private String dbname;
    @Value("${datasource.num}")
    private int num;

    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public DynamicDBUtil dynamicDataSource() {
        DynamicDBUtil dynamicDataSource = new DynamicDBUtil(dataSource(), dbname, num);
        return dynamicDataSource;

    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dynamicDataSource());

        //分页插件
        PageInterceptor pageHelper = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);


        //添加插件
        bean.setPlugins(new Interceptor[]{pageHelper});
        return bean.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DynamicDBUtil dynamicDataSource) {
        return new DataSourceTransactionManager(dynamicDataSource);
    }
}
