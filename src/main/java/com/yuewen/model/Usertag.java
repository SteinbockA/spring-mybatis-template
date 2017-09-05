package com.yuewen.model;

import com.yuewen.DataTransHandler;
import lombok.Data;
import org.apache.ibatis.annotations.Lang;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by duanyixiao on 2017/7/21.
 */
@Table(name = "tbusertag0")
@Data
public class Usertag {
    @Id
    private Long userid;
    private Long ywguid;
    private String tagname;
    @ColumnType(typeHandler = DataTransHandler.class)
    private Long createtime;
}
