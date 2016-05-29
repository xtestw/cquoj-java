package com.cquoj.dao.impl;

import com.cquoj.dao.IUserDao;
import com.cquoj.dao.IUsertagDao;
import com.cquoj.model.User;
import com.cquoj.model.Usertag;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/11/18.
 */
@Repository("usertagDao")
public class UsertagDao extends BaseDao<Usertag> implements IUsertagDao {



}
