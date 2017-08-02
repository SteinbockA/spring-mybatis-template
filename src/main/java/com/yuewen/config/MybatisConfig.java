package com.yuewen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * Created by duanyixiao on 2017/7/25.
 */

/**
 * 改配置必须放在另一个配置类中，如果和datasource和sqlsesstionfactory放在一起@value会一直拿不到值
 */
@Configuration
public class MybatisConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.yuewen.mapper");
        return mapperScannerConfigurer;
    }
}
