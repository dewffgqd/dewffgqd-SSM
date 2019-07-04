package com.hjr.dewffgqd.service;


import java.util.List;

/**
 * Project:web  <br/>
 * Description:  <br/>
 * Date:2017/11/21  <br/>
 * Email:moy25@foxmail.com  <br/>
 *
 * @author YeXiangYang
 */
public interface BaseService<T> {

    //保存
    Integer insert(T entity);

    //删除
    Integer delete(T entity);

    //更新
    Integer update(T entity);

    //查询
    List<T> select(T entity);

    //计数
    Integer count(T entity);
}