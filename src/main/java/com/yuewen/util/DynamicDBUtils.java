package com.yuewen.util;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.BeanUtils;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by duanyixiao on 2017/9/1.
 */
public class DynamicDBUtils extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public DynamicDBUtils(BasicDataSource dataSource, String dataBaseName, int dataBaseNum) {
        super();
        Map<Object, Object> targetDataSources = new HashMap<>();
        String url = dataSource.getUrl();
        while (dataBaseNum-- > 0) {
            BasicDataSource newDataSource = new BasicDataSource();
            dataSource.setUrl(String.format(url, dataBaseName + dataBaseNum));
            BeanUtils.copyProperties(dataSource, newDataSource, "logWriter", "loginTimeout");
            targetDataSources.put(dataBaseName + dataBaseNum, newDataSource);
        }
        super.setTargetDataSources(targetDataSources);
    }

    public static void clean() {
        contextHolder.remove();
    }

    private String getDatabaseName() {
        String dbName = contextHolder.get();
        if (StringUtils.isEmpty(dbName)) {
            throw new NullPointerException(">> can not get database from contextHolder");
        } else
            return dbName;
    }

    public static void setDatabaseName(String dbName) {
        contextHolder.set(dbName);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return getDatabaseName();
    }
}
