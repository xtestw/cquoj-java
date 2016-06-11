package com.cquoj.service;

import com.cquoj.dao.impl.StarsDao;
import com.cquoj.model.Pagination;
import com.cquoj.model.Problem;
import com.cquoj.model.Stars;
import com.cquoj.model.User;
import com.cquoj.service.impl.ProblemService;
import com.cquoj.service.impl.StarsService;
import com.cquoj.service.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/6/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-hibernate.xml","classpath:spring-mvc.xml"})
@TransactionConfiguration(transactionManager="transactionManager" , defaultRollback=false)
@Transactional
public class StarsServiceTest {
    @Resource
    private StarsService starsService;
    @Resource
    private ProblemService problemService;
    @Resource
    private StarsDao starsDao;
    @Resource
    private UserService userService;
    @Test
    public void Add(){
        Stars stars = new Stars();
        Problem problem = (Problem) problemService.queryById(1001);

        User user = (User) userService.queryById(1);
        stars.setProblem(problem);
        stars.setUser(user);
        stars.setState(0);
       // stars.setStarTime(Timestamp.valueOf((new Date()).toString()));
        starsService.add(1002,1);
    }
    @Test
    public void list(){
        Map<String,Object> mp=new HashMap<String,Object>();
        mp.put("state","1");
        Pagination<Stars> stars= starsService.queryProblemsByUid(0, 10, mp ,1);
        System.out.println(stars.getItems().size());
    }
}
