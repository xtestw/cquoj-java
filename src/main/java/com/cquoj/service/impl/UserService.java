package com.cquoj.service.impl;

import com.cquoj.dao.IRoleDao;
import com.cquoj.dao.IUserDao;
import com.cquoj.dao.impl.BaseDao;
import com.cquoj.dao.impl.UserDao;
import com.cquoj.model.Permission;
import com.cquoj.model.Role;
import com.cquoj.model.User;
import com.cquoj.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by admin on 2015/11/18.
 */
@Transactional
@Service("userService")
public class UserService extends EntityBaseService implements IUserService {

    @Resource
    private UserDao userDao;
    @Resource
    private IRoleDao roleDao;
    @Override
    public List<User> listUsers() {
        return userDao.findList("from User");
    }

    @Override
    public void update(User u) {
        userDao.update(u);
    }

    @Override
    public void delete(User u) {
        userDao.delete(u);
    }

    @Override
    public void add(User u) {
        userDao.save(u);
    }

    @Override
    public Set<String> findRoles(String email) {
       /* User u=findByEmail(email);
        List<Role> roles= u.getRole();
        Set<String> s=new HashSet<String>();
        for(Role role: roles){
            s.add(role.getRole());
        }
        return s;*/
        throw new NotImplementedException();
    }

    @Override
    public Set<String> findPermissions(String email) {
    /*    User u=findByEmail(email);
        List<Role> roles= u.getRole();
        Set<String> ret=new HashSet<String>();
        for(Role role:roles){
            for(Permission p:role.getPermissions())
            {
                ret.add(p.getPermission());
            }
        }
        return ret;
        */
        throw new NotImplementedException();
    }

    @Override
    public User findByEmail(String email) {
        return userDao.get("from User u where u.email = ?",email);
    }

    @Override
    protected BaseDao getDao() {
        return this.userDao;
    }
}
