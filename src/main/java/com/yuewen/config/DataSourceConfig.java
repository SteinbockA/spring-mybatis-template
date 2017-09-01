package com.yuewen.config;

import com.github.pagehelper.PageInterceptor;
import com.yuewen.constants.ConfigFileCons;
import com.yuewen.util.DynamicDBUtils;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import java.util.Properties;

/**
 * Created by duanyixiao on 2017/8/31.
 */
@Configuration
public class DataSourceConfig {

    @Autowired
    private ConfigFileCons config;

    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(config.driverClassName);
        dataSource.setUrl(config.url);
        dataSource.setUsername(config.username);
        dataSource.setPassword(config.password);
        return dataSource;
    }

    @Bean
    public DynamicDBUtils dynamicDataSource() {
        DynamicDBUtils dynamicDataSource = new DynamicDBUtils(dataSource(), config.dbname, config.num);
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
    public DataSourceTransactionManager transactionManager(DynamicDBUtils dynamicDataSource) {
        return new DataSourceTransactionManager(dynamicDataSource);
    }
}
