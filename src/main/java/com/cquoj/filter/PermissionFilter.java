package com.cquoj.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by xuwei on 5/10/16.
 */
public class PermissionFilter implements Filter {
    private static Set<String> loginFirstUrls;
    private static Set<String> adminFirstUrls;
    static{
        loginFirstUrls = new HashSet<String>();
        adminFirstUrls = new HashSet<String>();

    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
