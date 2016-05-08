package com.cquoj.service.impl;

import com.cquoj.bomodel.login.UserUpdateItem;
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
 * @author xuwei
 */

@Transactional
@Service("loginService")
public class LoginService implements ILoginService {
    private User user;
    @Resource
    private IUserDao userDao;

    @Override
    public boolean isExist(String name) {
        user = userDao.get("from User u where u.email = ? or u.username = ?", name, name);
        return user != null;
    }

    public boolean checkPassword(String password) {
        if (user == null || user.getPassword() != EncryptUtil.passwordEncrypt(password)) return false;
        return true;
    }

    @Override
    public boolean checkPassword(User u) {
        user = userDao.get("from User u where u.email=? and u.password=?", u.getEmail(), u.getPassword());
        if (user != null) return true;
        return false;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public String getCookies() {
        String time = (new Date()).toString();
        return EncryptUtil.MD5(user.getUsername() + user.getPassword() + time + "cquxw") + ";" + time;
    }
    @Override
    public boolean register(User u) {
        Object t = userDao.save(u);
        return t == null ? false : true;
    }

    @Override
    public User login(User u) {

        if (checkPassword(u)) {
            return user;
        }
        return null;
    }

    @Override
    public boolean UpdateUser(UserUpdateItem u) {
        if(u.getPassword()!=null && !u.getPassword().equals("")) user.setPassword(u.getPassword());
        user.setSchool(u.getSchool());
        user.setNickname(u.getNickname());
        user.setEmail(u.getEmail());
        userDao.update(user);
        return true;
    }
}
