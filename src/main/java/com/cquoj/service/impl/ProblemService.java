package com.cquoj.service.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
    public Pagination<Problem> queryProblems(int pageIndex,int pageSize,Map<String,Object> mp) {
        StringBuilder sb=new StringBuilder("");
        boolean flag=false;
        String str;
        for(Iterator it=mp.keySet().iterator();it.hasNext();flag=true){
            if(flag) sb.append(" and "); else sb.append(" where ");
            str=it.next().toString();
            sb.append(str).append("=:").append(str);
        }
        return problemDao.findPagination("from Problem"+sb.toString(),mp,pageIndex,pageSize);
    }


}


//~ Formatted by Jindent --- http://www.jindent.com
