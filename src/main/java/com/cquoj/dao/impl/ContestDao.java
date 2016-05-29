package com.cquoj.dao.impl;

import com.cquoj.dao.IContestDao;
import com.cquoj.dao.IProblemDao;
import com.cquoj.model.Contest;
import com.cquoj.model.Problem;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/11/18.
 */
@Repository("contestDao")
public class ContestDao extends BaseDao<Contest> implements IContestDao {


}
