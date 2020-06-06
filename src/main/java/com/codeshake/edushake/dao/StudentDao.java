package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao {

    int insertStudent(Student student);

    List<Student> selectAllStudents();

    Optional<Student> selectStudentById(String id);

    int deleteStudentById(String id);

    int updateStudentById(String id, Student student);
}
