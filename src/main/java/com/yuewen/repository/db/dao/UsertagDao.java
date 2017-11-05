package com.yuewen.repository.db.dao;


import com.yuewen.repository.db.base.AbstractDao;
import com.yuewen.repository.db.mapper.IMapper;
import com.yuewen.repository.db.model.Usertag;
import org.springframework.stereotype.Repository;

/**
 * Created by duanyixiao on 2017/9/5.
 */
@Repository
public class UsertagDao extends AbstractDao<Usertag> {

    //AbstractDao不够用的时候新增方法的demo
    public int duplicateinsert(){
        IMapper iMapper = (IMapper)super.getMapper();
        Usertag usertag = new Usertag();
        usertag.setUserid(99L);
        usertag.setYwguid(99L);
        usertag.setTagname("99");
        return iMapper.duplicateinsert(usertag);
    }
}
