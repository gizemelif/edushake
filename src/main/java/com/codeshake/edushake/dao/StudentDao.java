package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentDao {

    int insertStudent(Student student);

    List<Student> selectAllStudents();

    Optional<Student> selectStudentById(UUID id);

    int deleteStudentById(UUID id);

    int updateStudentById(UUID id, Student student);
}
