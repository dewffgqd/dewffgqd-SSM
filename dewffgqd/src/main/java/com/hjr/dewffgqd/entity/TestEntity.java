package com.hjr.dewffgqd.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Project:web  <br/>
 * Description:  <br/>
 * Date:2017/10/27  <br/>
 * Email:moy25@foxmail.com  <br/>
 *
 * @author YeXiangYang
 */
public class TestEntity implements Serializable {


    private static final long serialVersionUID = 8530202658667667146L;
    private Integer id;
    private Date gtmCreate;
    private Date gtmModified;
    private String desc;

    public TestEntity() {
    }

    public static TestEntity createInstance() {
        TestEntity test = new TestEntity();
        test.setGtmCreate(new Date());
        test.setGtmModified(new Date());
        test.setDesc("测试:[" + UUID.randomUUID() + "]");
        return test;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGtmCreate() {
        return gtmCreate;
    }

    public void setGtmCreate(Date gtmCreate) {
        this.gtmCreate = gtmCreate;
    }

    public Date getGtmModified() {
        return gtmModified;
    }

    public void setGtmModified(Date gtmModified) {
        this.gtmModified = gtmModified;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", gtmCreate=" + gtmCreate +
                ", gtmModified=" + gtmModified +
                ", desc='" + desc + '\'' +
                '}';
    }
}