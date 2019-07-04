package com.hjr.dewffgqd.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hjr.dewffgqd.entity.TestEntity;
import com.hjr.dewffgqd.mapper.TestDao;

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
public class TestDaoTest {

    @Autowired
    TestDao testDao;

    @Test
    public void insert() {
        TestEntity instance = TestEntity.createInstance();
        testDao.insert(instance);
    }

    @Test
    public void delete() {
        TestEntity instance = TestEntity.createInstance();
        testDao.insert(instance);
        testDao.delete(instance);
    }

    @Test
    public void update() {
        TestEntity instance = TestEntity.createInstance();
        testDao.insert(instance);
        instance.setDesc("我是被修改的");
        testDao.update(instance);
    }

    @Test
    public void select() {
        /*TestEntity instance = TestEntity.createInstance();
        testDao.insert(instance);*/
        TestEntity instance1 = new TestEntity();
        instance1.setId(3);
        System.out.println("-------------------" + Arrays.toString(testDao.select(instance1).toArray()));
    }

    @Test
    public void count() {
        System.out.println(testDao.count(null));
    }
}