package com.yuewen.model;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by duanyixiao on 2017/7/21.
 */
@Table(name = "tbusertag0")
public class Usertag {
    @Id
    private Long userid;
    private Long ywguid;
    private String tagname;
    private String createtime;


    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getYwguid() {
        return ywguid;
    }

    public void setYwguid(Long ywguid) {
        this.ywguid = ywguid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    @Override
    public String toString() {
        return "Usertag{" +
                "userid=" + userid +
                ", ywguid=" + ywguid +
                ", tagname='" + tagname + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
