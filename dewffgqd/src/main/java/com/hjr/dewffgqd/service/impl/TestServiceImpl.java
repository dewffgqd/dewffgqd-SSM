package com.hjr.dewffgqd.service.impl;

import com.hjr.dewffgqd.entity.TestEntity;
import com.hjr.dewffgqd.mapper.TestDao;
import com.hjr.dewffgqd.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Project:web  <br/>
 * Description:  <br/>
 * Date:2017/11/20  <br/>
 * Email:moy25@foxmail.com  <br/>
 *
 * @author YeXiangYang
 */
@Service("testService")
public class TestServiceImpl extends BaseServiceImpl<TestEntity> implements TestService {
	
	@Autowired
    TestDao testDao;
	
    @Override
    public void saveTxTest() {
        TestEntity instance = TestEntity.createInstance();
        instance.setDesc("在事务下，我保存不上");
        insert(instance);
        int i = 1 / 0;
    }
    
    public void saveTxTest2() {
        TestEntity instance = TestEntity.createInstance();
        instance.setDesc("在事务上，可以保存上");
        //insert(instance);
        testDao.insert(instance);
        //int i = 1 / 0;
    }
    
}