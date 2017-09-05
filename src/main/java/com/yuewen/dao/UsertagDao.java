package com.yuewen.dao;

import com.yuewen.base.AbstractDao;
import com.yuewen.mapper.IMapper;
import com.yuewen.model.Usertag;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by duanyixiao on 2017/9/5.
 */
@Repository
public class UsertagDao extends AbstractDao<Usertag> {

    //AbstractDao不够用的时候新增方法的demo
    public List<Usertag> test(){
        IMapper iMapper = (IMapper)super.getMapper();
        List<Usertag> list = iMapper.ttest();
        list.forEach(System.out::println);
        return list;
    }
}
