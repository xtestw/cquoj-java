package com.cquoj.dao.impl;

import com.cquoj.dao.ICategoryDao;
import com.cquoj.model.Category;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/11/18.
 */
@Repository("categoryDao")
public class CategoryDao extends BaseDao<Category> implements ICategoryDao {


}
