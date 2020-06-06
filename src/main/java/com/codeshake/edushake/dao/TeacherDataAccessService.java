package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TeacherDataAccessService implements TeacherDao {
    private static List<Teacher> DB = new ArrayList<>();

    @Override
    public int insertTeacher(Teacher teacher) {
        DB.add(new Teacher(teacher.getId(), teacher.getName(), teacher.getEmail()));

        return 1;
    }

    @Override
    public List<Teacher> selectAllTeachers() {
        return DB;
    }

    @Override
    public Optional<Teacher> selectTeacherById(String id) {
        return DB.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst();
    }
}
