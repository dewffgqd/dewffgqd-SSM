package com.hjr.dewffgqd.controller;

import com.hjr.dewffgqd.entity.TestEntity;
import com.hjr.dewffgqd.service.TestService;
import com.hjr.dewffgqd.utils.CacheUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;


/**
 * Project:web  <br/>
 * Description:  <br/>
 * Date:2017/11/20  <br/>
 * Email:moy25@foxmail.com  <br/>
 *
 * @author YeXiangYang
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;
    
    @ResponseBody
    @RequestMapping("/save")
    public String save(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(testService);
        TestEntity instance = TestEntity.createInstance();
        Serializable id = testService.insert(instance);
        System.out.println("1111111111111111111111"+id);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/saveTxTest")
    public String saveTxTest(HttpServletRequest request, HttpServletResponse response) {
        try {
            testService.saveTxTest2();
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }
    
    @ResponseBody
    @RequestMapping("redis")
    public String redisTest() {
	try {
	    boolean b = CacheUtil.setString("123", "redis");//向redis里存字符串 key-value
	    System.out.println(b);//true成功，
	    System.out.println(CacheUtil.getString("123"));//从radis里取数据 key
	} catch (Exception e) {
	    e.printStackTrace();
	    return null;
	}
	return "hello";
    }
}