package com.cquoj.service;

import com.cquoj.model.User;

import java.util.List;
import java.util.Set;

/**
 * Created by admin on 2015/11/18.
 */
public interface IUserService extends IEntityBaseService {
    public List<User> listUsers();
    public void update(User u);
    public void delete(User u);
    public void add(User u);

    Set<String> findRoles(String email);

    Set<String> findPermissions(String email);

    User findByEmail(String email);
}
