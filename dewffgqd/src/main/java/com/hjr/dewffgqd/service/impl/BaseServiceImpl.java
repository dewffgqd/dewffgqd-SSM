package com.hjr.dewffgqd.service.impl;

import com.hjr.dewffgqd.mapper.BaseDao;
import com.hjr.dewffgqd.mapper.TestDao;
import com.hjr.dewffgqd.service.BaseService;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Project:web  <br/>
 * Description:  <br/>
 * Date:2017/11/29  <br/>
 * Email:moy25@foxmail.com  <br/>
 *
 * @author YeXiangYang
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Resource
    protected TestDao testDao;
    protected BaseDao<T> baseDao;

    public static String ENTITY_NORM_SUFFIX = "Entity";

    @PostConstruct
    private void initBaseDao() {
        try {
            Class<? extends BaseServiceImpl> subClass = this.getClass();
            Class<?> superClass = subClass.getSuperclass();

            ParameterizedType type = (ParameterizedType) subClass.getGenericSuperclass();
            Class<T> clazz = (Class<T>) type.getActualTypeArguments()[0];

            String classSimpleName = clazz.getSimpleName();
            if (classSimpleName.lastIndexOf(ENTITY_NORM_SUFFIX) > 0) {
                classSimpleName = classSimpleName.substring(0, classSimpleName.lastIndexOf(ENTITY_NORM_SUFFIX)) + "Dao";
                String fieldName = classSimpleName.substring(0, 1).toLowerCase() + classSimpleName.substring(1);
                Field currentField = superClass.getDeclaredField(fieldName);
                Field baseField = superClass.getDeclaredField("baseDao");
                baseField.set(this, currentField.get(this));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Integer insert(T entity) {
        return baseDao.insert(entity);
    }

    @Override
    public Integer delete(T entity) {
        return baseDao.delete(entity);
    }

    @Override
    public Integer update(T entity) {
        return baseDao.update(entity);
    }

    @Override
    public List<T> select(T entity) {
        return baseDao.select(entity);
    }

    @Override
    public Integer count(T entity) {
        return baseDao.count(entity);
    }
}