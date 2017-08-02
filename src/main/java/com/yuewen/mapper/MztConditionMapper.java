package com.yuewen.mapper;

import com.yuewen.taf.servant.MztCondition;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by duanyixiao on 2017/7/24.
 */
public interface MztConditionMapper {
    @Select("select * from tbmztcondition where begindate < now() and enddate>now()")
    List<MztCondition> getMztConditionList();
}
