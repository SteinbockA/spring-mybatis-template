package com.yuewen.repository.db.base;

import com.yuewen.util.LogUtils;
import lombok.Data;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by duanyixiao on 2017/9/4.
 */
@Data
public abstract class AbstractDao<T> implements IBaseDao<T> {
    @Autowired
    private IBaseMapper<T> mapper;

    @Override
    public boolean save(T model) {
        checkNotNull(model);
        try {
            int res = mapper.insert(model);
            if (res > 0)
                return true;
        } catch (Exception e) {
            LogUtils.error("AbstractDao.save : exception, e={}", e);
        }
        return false;

    }

    @Override
    public boolean save(List<T> models) {
        checkArgument(!CollectionUtils.isEmpty(models), "AbstractDao.save, models is null or empty");
        try {
            int res = mapper.insertList(models);
            if (res == models.size())
                return true;
        } catch (Exception e) {
            LogUtils.error("AbstractDao.save : exception, e={}", e);
        }
        return false;

    }

    @Override
    public boolean deleteById(Integer id) {
        checkArgument(id >= 0, "AbstractDao.deleteById, id<0");
        try {
            int res = mapper.deleteByPrimaryKey(id);
            if (res > 0)
                return true;
        } catch (Exception e) {
            LogUtils.error("AbstractDao.deleteById : exception ,e ={}", e);
        }
        return false;

    }

    @Override
    public boolean deleteByIds(String ids) {
        checkArgument(!StringUtils.isEmpty(ids), "AbstractDao.deleteByIds, ids is null or empty");
        try {
            int res = mapper.deleteByIds(ids);
            if (res == ids.split(",").length)
                return true;
        } catch (Exception e) {
            LogUtils.error("AbstractDao.deleteByIds : exception , e={}", e);
        }
        return false;
    }

    @Override
    public boolean update(T model) {
        checkNotNull(model);
        try {
            int res = mapper.updateByPrimaryKeySelective(model);
            if (res > 0)
                return true;
        } catch (Exception e) {
            LogUtils.error("AbstractDao.update : exception , e={}", e);
        }
        return false;

    }

    @Override
    public Optional<T> findById(Integer id) {
        try {
            T instance = mapper.selectByPrimaryKey(id);
            return Optional.ofNullable(instance);
        } catch (Exception e) {
            LogUtils.error("AbstractDao.findById : exception , e={}", e);
        }
        return Optional.empty();
    }

    @Override
    public Optional<List<T>> findBy(T model) throws TooManyResultsException {
        checkNotNull(model);
        try{
            List<T> list = mapper.select(model);
            return Optional.ofNullable(list);
        }catch (Exception e){
            LogUtils.error("AbstractDao.findBy : exception , e={}",e);
        }
        return Optional.empty();
    }

    @Override
    public Optional<List<T>> findByIds(String ids) {
        checkArgument(!StringUtils.isEmpty(ids),"AbstractDao.findByIds, ids is null or empty");
        try{
            List<T> list = mapper.selectByIds(ids);
            return Optional.ofNullable(list);
        }catch (Exception e){
            LogUtils.error("AbstractDao.findByIds : exception , e={}",e);
        }
        return Optional.empty();
    }

    @Override
    public Optional<List<T>> findByCondition(Condition condition) {
        try{
            List<T> list = mapper.selectByExample(condition);
            return Optional.ofNullable(list);
        }catch (Exception e){
            LogUtils.error("AbstractDao.findByCondition : exception , e={}",e);
        }
        return Optional.empty();
    }

    @Override
    public Optional<List<T>> findAll() {
        try{
            return Optional.ofNullable(mapper.selectAll());
        }catch (Exception e){
            LogUtils.error("AbstractDao.findAll : exception , e={}",e);
        }
        return Optional.empty();
    }

    @Override
    public int count(T model) {
        try{
            return mapper.selectCount(model);
        }catch (Exception e){
            LogUtils.error("AbstractDao.count : exception , e={}",e);
        }
        return -99;
    }
}
