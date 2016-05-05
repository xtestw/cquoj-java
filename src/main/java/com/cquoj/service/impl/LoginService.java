package com.cquoj.service.impl;

import com.cquoj.dao.IUserDao;
import com.cquoj.model.User;
import com.cquoj.service.ILoginService;
import com.cquoj.util.EncryptUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by admin on 2015/11/20.
 */

@Transactional
@Service("loginService")
public class LoginService implements ILoginService {
    private  User user;
    @Resource
    private IUserDao userDao;
    @Override
    public boolean isExist(String name) {
        user = userDao.get("from User u where u.email = ? or u.username = ?",name,name);
        return user != null;
    }
    public boolean checkPassword(String password){
        if(user==null || user.getPassword()!= EncryptUtil.passwordEncrypt(password)) return false;
        return true;
    }
    @Override
    public boolean checkPassword(User u) {
        user=userDao.get("from User u where u.email=? and u.password=?",u.getEmail(),u.getPassword());
        if(user!=null) return true;
        return false;
    }
    @Override
    public User getUser(){
        return user;
    }

    @Override
    public String getCookies() {
        String time = (new Date()).toString();
        return EncryptUtil.MD5(user.getUsername() + user.getPassword() + time + "cquxw")+";"+time;
    }

    @Override
    public User register(User u) {
        if(isExist(u.getUsername())) return null ;
        userDao.save(u);
        return  u;
    }

    @Override
    public User login(User u) {

        if(checkPassword(u)){
            return user;
        }
        return null;
    }
}
