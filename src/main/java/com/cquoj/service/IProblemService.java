package com.cquoj.service;

import com.cquoj.bomodel.problem.ProblemCondition;
import com.cquoj.bomodel.problem.ProblemListCondition;
import com.cquoj.model.Problem;

import java.util.List;

/**
 * Created by xuwei on 5/9/16.
 */
public interface IProblemService {
    public List<Problem> getProblems(ProblemListCondition condition);
    public Problem  getProblem(ProblemCondition condition);
    public boolean addProblem();
    public boolean updateProblem();

}
