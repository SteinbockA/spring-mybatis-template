package com.yuewen.repository.db.mapper;

import com.yuewen.repository.db.base.IBaseMapper;
import com.yuewen.repository.db.model.Usertag;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by duanyixiao on 2017/9/5.
 */
public interface IMapper extends IBaseMapper<Usertag> {
    @Insert("insert into tbusertag0(userid,ywguid,tagname,createtime) values(#{userid},#{ywguid},#{tagname},now()) on DUPLICATE KEY update createtime = now();")
    int duplicateinsert(Usertag usertag);
}
