package com.cquoj.service.impl;

import java.util.List;

import com.cquoj.dao.impl.BaseDao;
import com.cquoj.dao.impl.ProblemDao;
import com.cquoj.model.Pager;
import com.cquoj.model.Pagination;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cquoj.bomodel.problem.ProblemCondition;
import com.cquoj.bomodel.problem.ProblemListCondition;
import com.cquoj.model.Problem;
import com.cquoj.service.IProblemService;

import javax.annotation.Resource;

/**
 * Class description
 *
 * @author xuwei
 * @version 1.0, 16/05/09
 */
@Transactional
@Service("problemService")
public class ProblemService extends EntityBaseService implements IProblemService {

    @Resource
    private ProblemDao problemDao;

    @Override
    protected BaseDao getDao() {
        return this.problemDao;
    }

    @Override
    public Pagination<Problem> queryProblems(int pageIndex,int pageSize) {
        HashMap<String,>
        return problemDao.findPagination("from Problem",pageIndex,pageSize);
    }


}


//~ Formatted by Jindent --- http://www.jindent.com
