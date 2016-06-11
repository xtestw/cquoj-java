package com.cquoj.service.impl;

import com.cquoj.dao.impl.BaseDao;
import com.cquoj.service.IEntityBaseService;
import com.cquoj.util.HqlParamUtil;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

    @Override
    public void deleteById(Serializable t){
        delete(queryById(t));
    }

    protected String mapToParamStr(Map<String,Object> mp){
        if(mp==null) return "";
        StringBuilder sb=new StringBuilder("");
        boolean flag=false;
        String str;
        for(Iterator it=mp.keySet().iterator();it.hasNext();flag=true){
            if(flag) sb.append(" and "); else sb.append(" where ");
            str=it.next().toString();
            sb.append(str).append("=:").append(str);
        }
        return sb.toString();
    }
}
