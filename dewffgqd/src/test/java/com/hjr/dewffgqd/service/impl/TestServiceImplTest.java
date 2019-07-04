package com.hjr.dewffgqd.service.impl;

import com.hjr.dewffgqd.entity.TestEntity;
import com.hjr.dewffgqd.service.TestService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

/**
 * [Project]:whymoy  <br/>
 * [Email]:moy25@foxmail.com  <br/>
 * [Date]:2018/3/7  <br/>
 * [Description]:  <br/>
 *
 * @author YeXiangYang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class TestServiceImplTest {

    @Autowired
    TestService testService;

    @Test
    public void insert() {
        TestEntity instance = TestEntity.createInstance();
        testService.insert(instance);
    }

    @Test
    public void delete() {
        TestEntity instance = TestEntity.createInstance();
        testService.insert(instance);
        testService.delete(instance);
    }

    @Test
    public void update() {
        TestEntity instance = TestEntity.createInstance();
        testService.insert(instance);
        instance.setDesc("我是被修改的");
        testService.update(instance);
    }

    @Test
    public void select() {
        TestEntity instance = TestEntity.createInstance();
        testService.insert(instance);
        System.out.println(Arrays.toString(testService.select(instance).toArray()));
    }

    @Test
    public void count() {
        System.out.println(testService.count(null));
    }

}