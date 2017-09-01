package com.yuewen.mapper;

import com.yuewen.model.Usertag;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by duanyixiao on 2017/7/21.
 */
public interface UsertagMapper {
    @Select("select * from tbusertag")
    List<Usertag> getAllWithMapper();
}
