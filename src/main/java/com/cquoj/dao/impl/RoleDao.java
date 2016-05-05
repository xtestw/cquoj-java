package com.cquoj.dao.impl;

import com.cquoj.dao.IRoleDao;
import com.cquoj.model.Role;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/12/8.
 */
@Repository("roleDao")
public class RoleDao extends BaseDao<Role> implements IRoleDao {
}
