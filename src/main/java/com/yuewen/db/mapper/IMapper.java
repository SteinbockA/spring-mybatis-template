package com.yuewen.db.mapper;

import com.yuewen.base.IBaseMapper;
import com.yuewen.db.model.Usertag;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by duanyixiao on 2017/9/5.
 */
public interface IMapper extends IBaseMapper<Usertag> {
    @Select("select * from tbusertag0")
    List<Usertag> ttest();
}
