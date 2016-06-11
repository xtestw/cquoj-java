package com.cquoj.service;

import com.cquoj.model.Pagination;
import com.cquoj.model.Problem;
import com.cquoj.model.Stars;

import java.util.Map;

/**
 * Created by xuwei on 5/9/16.
 */
public interface IStarsService extends IEntityBaseService{
    public Pagination<Stars> queryProblems(int pageIndex, int pageSize, Map<String, Object> mp);
    public Pagination<Stars> queryProblemsByUid(int pageIndex, int pageSize,Map<String,Object> mp,int uid);

    public boolean add(Integer pid, Integer uid);

    public boolean delete(Integer pid, Integer uid);
}
