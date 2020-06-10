package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.Teacher;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TeacherDao {

    int insertTeacher(Teacher teacher);

    List<Teacher> selectAllTeachers();

    Optional<Teacher> selectTeacherById(UUID id);
}
