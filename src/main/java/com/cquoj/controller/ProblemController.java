package com.cquoj.controller;

import com.cquoj.bomodel.MapParam;
import com.cquoj.bomodel.problem.ProblemListCondition;
import com.cquoj.bomodel.problem.ProblemListItem;
import com.cquoj.model.Pagination;
import com.cquoj.model.Problem;
import com.cquoj.service.impl.ProblemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;

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
    public Pagination<Problem> list(Integer pageIndex,Integer pageSize,MapParam mapParam) {
        if (pageIndex==null) pageIndex=0;
        if (pageSize==null) pageSize=20;
        return problemService.queryProblems(pageIndex, pageSize, mapParam.getMapParam());//mp.getMp());
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
