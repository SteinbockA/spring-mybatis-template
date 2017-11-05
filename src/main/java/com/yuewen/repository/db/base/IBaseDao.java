package com.yuewen.repository.db.base;

import tk.mybatis.mapper.entity.Condition;

import java.util.List;
import java.util.Optional;

/**
 * Created by duanyixiao on 2017/9/4.
 */
public interface IBaseDao<T> {
    boolean save(T model);//持久化
    boolean save(List<T> models);//批量持久化
    boolean deleteById(Integer id);//通过主鍵刪除
    boolean deleteByIds(String ids);//批量刪除 eg：ids -> “1,2,3,4”
    boolean update(T model);//更新
    Optional<T> findById(Integer id);//通过ID查找
    Optional<List<T>> findBy(T model); //通过Model中某个成员变量名称
    Optional<List<T>> findByIds(String ids);//通过多个ID查找//eg：ids -> “1,2,3,4”
    Optional<List<T>> findByCondition(Condition condition);//根据条件查找
    Optional<List<T>> findAll();//获取所有
    int count(T model);//获取某个条件的总数
}
