package com.detroitlabs.golfrankapp.controller;

import com.detroitlabs.golfrankapp.model.CourseInfo;
import com.detroitlabs.golfrankapp.model.Courses;
import com.detroitlabs.golfrankapp.service.GolfCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

    @Autowired
    private GolfCourseService golfCourseService;

    @ResponseBody
    @RequestMapping ("/")
    public String displayCourseInfo(){
        Courses courses = golfCourseService.fetchCourseInfo();
        CourseInfo courseInfo = courses.getResources();


        return "";
    }

}
