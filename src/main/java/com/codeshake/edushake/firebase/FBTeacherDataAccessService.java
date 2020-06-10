package com.codeshake.edushake.firebase;

import com.codeshake.edushake.dao.TeacherDao;
import com.codeshake.edushake.model.Teacher;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class FBTeacherDataAccessService implements TeacherDao {
    @Override
    public int insertTeacher(Teacher teacher) {
        return 0;
    }

    @Override
    public List<Teacher> selectAllTeachers() {
        return null;
    }

    @Override
    public Optional<Teacher> selectTeacherById(UUID id) {
        return Optional.empty();
    }
}
