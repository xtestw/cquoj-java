package com.cquoj.service.impl;

import com.cquoj.dao.impl.BaseDao;
import com.cquoj.service.IEntityBaseService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuwei on 5/29/16.
 */
public abstract class EntityBaseService<T>  implements IEntityBaseService {

    protected abstract BaseDao getDao();

    @Override
    public void add(Object t) {
        getDao().save(t);
    }

    @Override
    public void delete(Object t) {
        getDao().delete(t);
    }

    @Override
    public void update(Object t) {
        getDao().update(t);
    }

    @Override
    public void saveOrUpdate(Object t) {
        getDao().saveOrUpdate(t);
    }

    @Override
    public Object queryById(Serializable t) {
        return getDao().getById(t);
    }

}
