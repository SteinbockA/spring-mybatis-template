package com.yuewen.base;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Created by duanyixiao on 2017/9/4.
 */
public class AbstractService<T> implements BaseService<T> {

    @Autowired
    BaseMapper<T> mapper;
    @Override
    public void save(T model) {

    }

    @Override
    public void save(List<T> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(T model) {

    }

    @Override
    public T findById(Integer id) {
        return null;
    }

    @Override
    public T findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<T> findByIds(String ids) {
        return null;
    }

    @Override
    public List<T> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
