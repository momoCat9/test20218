package com.cui.controller;

import com.cui.service.StudentService;
import com.cui.util.BaseResponseInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Resource
    public StudentService studentService;

    @PostMapping("/addStudent")
    public BaseResponseInfo addStudent(/*@RequestBody Student student*/@RequestParam String name,
                                                                       @RequestParam int age){
        BaseResponseInfo baseResponseInfo = new BaseResponseInfo();
        int i = studentService.add(name, age);
        baseResponseInfo.data = i;
        return baseResponseInfo;
    }

    @PostMapping("/selectStudents")
    public BaseResponseInfo selectStudents(@RequestParam("id") int id){
        BaseResponseInfo baseResponseInfo = new BaseResponseInfo();
        baseResponseInfo.code = 200;
        baseResponseInfo.data = studentService.selectStudent(id);
        return baseResponseInfo;
    }
}
