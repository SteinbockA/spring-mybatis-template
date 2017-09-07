package com.yuewen.dao;

import com.yuewen.base.AbstractDao;
import com.yuewen.mapper.IMapper;
import com.yuewen.model.Usertag;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

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

    @Transactional
    public void testTransaction(){
        Usertag usertag = new Usertag();
        usertag.setUserid(100L);
        usertag.setTagname("100L");
        usertag.setYwguid(100L);
        usertag.setCreatetime(System.currentTimeMillis());
        Mapper<Usertag> mapper = super.getMapper();
        mapper.insert(usertag);
        throw  new RuntimeException();
    }

}
