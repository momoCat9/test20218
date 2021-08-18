package com.cui.service;

import com.cui.pojo.entity.Student;

public interface StudentService {

    int add(String name, int age);

    Student selectStudent(int id);
}
