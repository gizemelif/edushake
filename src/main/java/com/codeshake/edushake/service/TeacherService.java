package com.codeshake.edushake.service;

import com.codeshake.edushake.dao.TeacherDao;
import com.codeshake.edushake.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherDao teacherDao;

    @Autowired
    public TeacherService(@Qualifier("fakeDao") TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }
    public int addTeacher(Teacher teacher) {
        return teacherDao.insertTeacher(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherDao.selectAllTeachers();
    }

    public Optional<Teacher> getTeacherById(String id) {
        return teacherDao.selectTeacherById(id);
    }
}
