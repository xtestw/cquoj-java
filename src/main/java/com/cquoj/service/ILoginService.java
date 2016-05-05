package com.cquoj.service;

import com.cquoj.model.User;

/**
 * Created by admin on 2015/11/20.
 */
public interface ILoginService {
    public boolean isExist(String username);
    public boolean checkPassword(User u);
    public boolean checkPassword(String str);
    public User getUser();
    public String getCookies();
    public User register(User u);
    public User login(User u);
}
