package com.cquoj.dao.impl;

import com.cquoj.dao.ICategoryDao;
import com.cquoj.dao.IDiscussDao;
import com.cquoj.model.Category;
import com.cquoj.model.Discuss;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/11/18.
 */
@Repository("discussDao")
public class DiscussDao extends BaseDao<Discuss> implements IDiscussDao {


}
