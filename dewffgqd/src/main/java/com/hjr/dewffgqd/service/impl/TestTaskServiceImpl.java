package com.hjr.dewffgqd.service.impl;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * [Project]:moy-gradle-project  <br/>
 * [Email]:moy25@foxmail.com  <br/>
 * [Date]:2018/3/6  <br/>
 * [Description]:  <br/>
 *
 * @author YeXiangYang
 */
@Component("testTaskService")
public class TestTaskServiceImpl {

    public void printCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
    }
}