package com.cquoj.controller;

import com.cquoj.bomodel.problem.ProblemListCondition;
import com.cquoj.bomodel.problem.ProblemListItem;
import com.cquoj.model.Problem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xuwei on 5/9/16.
 */
@Controller
@RequestMapping("/problem")
public class ProblemController {

    @ResponseBody
    @RequestMapping(value = "/list")
    public ProblemListItem list(ProblemListCondition condition) {
        return null;
    }
}
