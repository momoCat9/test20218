package com.cui.service.impl;

import com.cui.pojo.entity.Student;
import com.cui.pojo.mapper.StudentMapper;
import com.cui.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    public StudentMapper studentMapper;

    @Override
    public int add(String name, int age) {
        int i = studentMapper.inertStudent(name,age);
        return i;
    }

    @Override
    public Student selectStudent(int id) {
        Student student = studentMapper.selectStudent(id);
        return student;
    }
}
