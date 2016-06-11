package com.cquoj.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuwei on 5/29/16.
 */
public interface IEntityBaseService {
    public void add(Object t);
    public void delete(Object t);
    public void update(Object t);
    public void saveOrUpdate(Object t);
    public Object queryById(Serializable t);
    public void deleteById(Serializable t);
}
