package com.yuewen.db.mapper;

import org.apache.ibatis.annotations.Select;
import com.yuewen.db.model.Usertag;

import java.util.List;

/**
 * Created by duanyixiao on 2017/7/21.
 */
public interface UsertagMapper {
    @Select("select * from tbusertag")
    List<Usertag> getAllWithMapper();
}
