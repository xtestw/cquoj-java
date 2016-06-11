package com.cquoj.controller;

import com.cquoj.bomodel.MapParam;
import com.cquoj.bomodel.login.Status;
import com.cquoj.model.Pagination;
import com.cquoj.model.Problem;
import com.cquoj.model.Stars;
import com.cquoj.service.impl.StarsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/6/11.
 */
@Controller
@RequestMapping("/stars")
public class StarsController {

    @Resource
    private StarsService starsService;
    @RequestMapping("/list")
    @ResponseBody
    public Object list(Integer pageIndex,Integer pageSize,Integer uid,MapParam  mapParam){

        if (pageIndex==null) pageIndex=0;
        if (pageSize==null) pageSize=20;
        if(uid == null ) return new  Pagination<Stars>();
        Pagination<Stars> stars = starsService.queryProblemsByUid(pageIndex, pageSize, mapParam.getMapParam(), uid);
        Pagination<Problem> problems =new Pagination<Problem>();
        problems.CopyInfos(stars);
        List<Problem> problemList = new ArrayList<Problem>();
        for(Stars star : stars.getItems()){
            Problem problem= new Problem();
            problem.setPid(star.getProblem().getPid());
            problem.setTitle(star.getProblem().getTitle());
            star.setProblem(problem);
        }
        problems.setItems(problemList);
        return stars;
    }

    @RequestMapping("/add")
    @ResponseBody
    public Status add(Integer pid,Integer uid){

        if(uid==null) return new Status(0,"无效用户");
        if(pid==null) return new Status(0,"无效题号");

        return starsService.add(pid,uid)?new Status(1,"success!"):new Status(0,"falied to star");
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Status delete(Integer pid,Integer uid){
        if(uid==null) return new Status(0,"无效用户");
        if(pid==null) return new Status(0,"无效题号");
        return starsService.delete(pid,uid)?new Status(1,"success!"):new Status(0,"falied to star");
    }
}
