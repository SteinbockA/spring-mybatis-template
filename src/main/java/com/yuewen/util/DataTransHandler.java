package com.yuewen.util;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;

/**
 * Created by duanyixiao on 2017/9/5.
 */
public class DataTransHandler extends BaseTypeHandler<Long> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Long aLong, JdbcType jdbcType) throws SQLException {
        preparedStatement.setLong(i,aLong);
    }

    @Override
    public Long getNullableResult(ResultSet resultSet, String s) throws SQLException {
        Timestamp sqlTime = resultSet.getTimestamp(s);
        if(sqlTime!=null)
            return sqlTime.getTime();
        return null;
    }

    @Override
    public Long getNullableResult(ResultSet resultSet, int i) throws SQLException {
        Timestamp sqlTime = resultSet.getTimestamp(i);
        if(sqlTime !=null)
            return sqlTime.getTime();
        return null;
    }

    @Override
    public Long getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        Timestamp sqlTime = callableStatement.getTimestamp(i);
        if(sqlTime!=null)
            return sqlTime.getTime();
        return null;
    }
}
