package com.cui.pojo.mapper;

import com.cui.pojo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface StudentMapper {
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int inertStudent(String name, int age);

    Student selectStudent(int id);
}
