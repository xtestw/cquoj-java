package com.cquoj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cquoj.bomodel.problem.ProblemCondition;
import com.cquoj.bomodel.problem.ProblemListCondition;
import com.cquoj.model.Problem;
import com.cquoj.service.IProblemService;

/**
 * Class description
 *
 * @author xuwei
 * @version 1.0, 16/05/09
 */
@Transactional
@Service("problemService")
public class ProblemService implements IProblemService {
    @Override
    public boolean addProblem() {
        return false;
    }

    @Override
    public boolean updateProblem() {
        return false;
    }

    @Override
    public Problem getProblem(ProblemCondition condition) {
        return null;
    }

    @Override
    public List<Problem> getProblems(ProblemListCondition condition) {
        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
