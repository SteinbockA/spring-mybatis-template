package com.yuewen.mapper;

import com.yuewen.base.IBaseMapper;
import com.yuewen.model.Usertag;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by duanyixiao on 2017/9/5.
 */
public interface IMapper extends IBaseMapper<Usertag> {
    @Insert("insert into tbusertag0(userid,ywguid,tagname,createtime) values(#{userid},#{ywguid},#{tagname},now()) on DUPLICATE KEY update createtime = now();")
    int duplicateinsert(Usertag usertag);
}
