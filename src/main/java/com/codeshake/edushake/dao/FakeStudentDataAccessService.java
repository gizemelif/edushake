package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeDao")
public class FakeStudentDataAccessService implements StudentDao {

    private static List<Student> DB = new ArrayList<>();

    @Override
    public int insertStudent(Student student) {
        DB.add(new Student(student.getId(), student.getName(),student.getEmail()));
        return 1;
    }

    @Override
    public List<Student> selectAllStudents() {
        return DB;
    }

    @Override
    public Optional<Student> selectStudentById(String id) {
        return DB.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteStudentById(String id) {
        Optional<Student> studentMayBe = selectStudentById(id);
        if(studentMayBe.isEmpty()){
            return 0;
        }
        DB.remove(studentMayBe.get());
        return 1;
    }

    @Override
    public int updateStudentById(String id, Student updateStudent) {
        return selectStudentById(id)
                .map(student -> {
                    int indexOfStudentToUpdate = DB.indexOf(student);
                    if(indexOfStudentToUpdate >= 0) {
                        DB.set(indexOfStudentToUpdate, new Student(id, updateStudent.getName(), updateStudent.getEmail()));

                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
