package com.cquoj.dao.impl;

import com.cquoj.dao.IStarsDao;
import com.cquoj.model.Stars;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2016/6/10.
 */

@Repository("starsDao")
public class StarsDao extends BaseDao<Stars> implements IStarsDao {
}
