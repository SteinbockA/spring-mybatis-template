package com.yuewen.base;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by duanyixiao on 2017/9/4.
 */
public interface IBaseMapper<T> extends Mapper<T>,MySqlMapper<T>,IdsMapper<T> {
}
