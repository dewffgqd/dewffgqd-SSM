package com.hjr.dewffgqd.mapper;


import java.util.List;

/**
 * Project:web  <br/>
 * Description:  <br/>
 * Date:2017/11/21  <br/>
 * Email:moy25@foxmail.com  <br/>
 *
 * @author YeXiangYang
 */
public interface BaseDao<T> {

    Integer insert(T entity);

    Integer delete(T entity);

    Integer update(T entity);

    List<T> select(T entity);

    Integer count(T entity);
}