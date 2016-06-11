package com.cquoj.service.impl;

import com.cquoj.dao.IStarsDao;
import com.cquoj.dao.impl.BaseDao;
import com.cquoj.dao.impl.ProblemDao;
import com.cquoj.dao.impl.StarsDao;
import com.cquoj.dao.impl.UserDao;
import com.cquoj.model.Pagination;
import com.cquoj.model.Problem;
import com.cquoj.model.Stars;
import com.cquoj.model.User;
import com.cquoj.service.IProblemService;
import com.cquoj.service.IStarsService;
import com.cquoj.util.HqlParamUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

/**
 * Class description
 *
 * @author xuwei
 * @version 1.0, 16/05/09
 */
@Transactional
@Service("starsService")
public class StarsService extends EntityBaseService implements IStarsService {

    @Resource
    private StarsDao starsDao;

    @Resource
    private UserDao userDao;

    @Resource
    private ProblemDao problemDao;

    @Override
    protected BaseDao getDao() {
        return this.starsDao;
    }

    @Override
    public Pagination<Stars> queryProblems(int pageIndex,int pageSize,Map<String,Object> mp) {
        String paramStr=this.mapToParamStr(mp);
        mp= HqlParamUtil.reType(mp,Stars.class);
        return starsDao.findPagination("from Stars"+paramStr,mp,pageIndex,pageSize);
    }

    @Override
    public Pagination<Stars> queryProblemsByUid(int pageIndex, int pageSize, Map<String, Object> mp, int uid) {
        String paramStr=this.mapToParamStr(mp);
        mp= HqlParamUtil.reType(mp,Stars.class);
        mp.put("uid",uid);
        if(paramStr.equals("")) paramStr=" where user.uid=:uid"; else paramStr=paramStr+" and user.uid=:uid";
        return starsDao.findPagination("from Stars "+paramStr,mp,pageIndex,pageSize);
    }

    @Override
    public boolean add(Integer pid, Integer uid) {
        Stars stars = new Stars();
        stars.setProblem(problemDao.getById(pid));
        stars.setUser(userDao.getById(uid));
        stars.setState(0);
        stars.setStarTime(new Timestamp((new Date()).getTime()));
        Stars stars2=starsDao.get("from Stars where pid=? and uid=?",pid,uid);
        return  stars2!=null?true:(starsDao.save(stars)!=null);
    }

    @Override
    public boolean delete(Integer pid, Integer uid) {
        starsDao.execute("delete Stars where pid="+pid+" and uid="+uid);
        Stars stars=starsDao.get("from Stars where pid=? and uid=?",pid,uid);
        return stars==null;
    }


}


//~ Formatted by Jindent --- http://www.jindent.com
