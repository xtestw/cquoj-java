package com.cquoj.controller;


import com.cquoj.bomodel.login.LoginParam;
import com.cquoj.bomodel.login.Status;
import com.cquoj.model.User;
import com.cquoj.service.ILoginService;
import com.cquoj.service.IUserService;
import com.cquoj.util.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by admin on 2015/11/20.
 */

@Controller
@RequestMapping("/user")
public class LoginController {
    @Resource
    private ILoginService loginService;
    @Resource
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/login")
    public Status login(LoginParam param, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("dd");
        if (!loginService.isExist(param.getUsername())) return new Status(0, "No Such User!");
        if (!loginService.checkPassword(param.getPassword())) return new Status(0, "Wrong Password!");
        Cookie cookie = new Cookie("user", loginService.getCookies());
        cookie.setMaxAge(param.getCksave() * 24 * 60 * 60);
        cookie.setPath("/");
        response.addCookie(cookie);
        return new Status(1, "Success...");
    }

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Status register(User u, String code, HttpSession httpSession) {

        return new Status(1, "Success...");
    }

    @ResponseBody
    @RequestMapping(value = "/logout")
    public Status logout(HttpSession httpSession, Model model) {
        return new Status(1, "Success...");
    }
}
