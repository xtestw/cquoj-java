package com.cquoj.dao.impl;

import com.cquoj.dao.IUserDao;
import com.cquoj.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/11/18.
 */
@Repository("userDao")
public class UserDao extends BaseDao<User> implements IUserDao {



}
