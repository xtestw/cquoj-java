package com.cquoj.service;

import com.cquoj.model.Problem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by xuwei on 5/29/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-hibernate.xml","classpath:spring-mvc.xml"})
@TransactionConfiguration(transactionManager="transactionManager" , defaultRollback=false)
@Transactional
public class ProblemServiceTest {
    @Resource
    private IProblemService problemService;
    @Test
    public void Add(){
        Problem p = new Problem();
        p.setVname("Eee");
        problemService.add(p);
    }
}
