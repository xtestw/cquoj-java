package com.cquoj.service;

import com.cquoj.bomodel.problem.ProblemCondition;
import com.cquoj.bomodel.problem.ProblemListCondition;
import com.cquoj.model.Pager;
import com.cquoj.model.Pagination;
import com.cquoj.model.Problem;

import java.util.List;

/**
 * Created by xuwei on 5/9/16.
 */
public interface IProblemService extends IEntityBaseService{
    public Pagination<Problem> queryProblems(int pageIndex,int pageSize);
}
