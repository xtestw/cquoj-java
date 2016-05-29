package com.cquoj.dao.impl;

import com.cquoj.dao.IProblemDao;
import com.cquoj.dao.IUserDao;
import com.cquoj.model.Problem;
import com.cquoj.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/11/18.
 */
@Repository("problemDao")
public class ProblemDao extends BaseDao<Problem> implements IProblemDao {


}
