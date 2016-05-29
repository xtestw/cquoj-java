package com.cquoj.controller;

import com.cquoj.bomodel.problem.ProblemListCondition;
import com.cquoj.bomodel.problem.ProblemListItem;
import com.cquoj.model.Pagination;
import com.cquoj.model.Problem;
import com.cquoj.service.impl.ProblemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by xuwei on 5/9/16.
 */
@Controller
@RequestMapping("/problem")
public class ProblemController {

    @Resource
    private ProblemService problemService;
    @ResponseBody
    @RequestMapping(value = "/list")
    public Pagination<Problem> list(ProblemListCondition condition) {
        System.out.println("ee");
        return problemService.queryProblems(0,50);

    }


    @ResponseBody
    @RequestMapping(value = "/add")
    public ProblemListItem add(Problem problem) {


        Problem p = new Problem();
        p.setVname("Eee");
        problemService.add(p);
        return null;
    }
}
