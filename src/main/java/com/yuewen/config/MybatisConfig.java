package com.yuewen.config;

import com.yuewen.repository.db.base.IBaseMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

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
        mapperScannerConfigurer.setBasePackage("com.yuewen.repository.db.mapper");

        Properties properties = new Properties();
        properties.setProperty("mappers", IBaseMapper.class.getName());
        properties.setProperty("notEmpty", "false");//insert、update是否判断字符串类型!='' 即 test="str != null"表达式内是否追加 and str != ''
        properties.setProperty("IDENTITY", "MYSQL");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
