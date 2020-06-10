package com.codeshake.edushake.firebase;

import com.codeshake.edushake.dao.StudentDao;
import com.codeshake.edushake.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class FBStudentDataAccessService implements StudentDao {
    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public List<Student> selectAllStudents() {
        return null;
    }

    @Override
    public Optional<Student> selectStudentById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteStudentById(UUID id) {
        return 0;
    }

    @Override
    public int updateStudentById(UUID id, Student student) {
        return 0;
    }
}
