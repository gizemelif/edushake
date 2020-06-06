package com.codeshake.edushake.service;

import com.codeshake.edushake.dao.StudentDao;
import com.codeshake.edushake.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentDao studentDao;

    //Burada db'ye isim vermemimizin sebebi başka bir database ile bağlantı kurulmak istenildiğinde onun içinde bir dao
    //class ı oluşturmamız ve repository ye isim vermemiz, daha sonra burada @Qualifier'daki ismi değiştirmemiz
    //dao da tanımlı metotları kolayca kullanabilmemizi sağlayacaktır.
    @Autowired
    public StudentService(@Qualifier("fakeDao") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }

    public Optional<Student> getStudentById(String id) {
        return studentDao.selectStudentById(id);
    }

    public int deleteStudent(String id) {
        return studentDao.deleteStudentById(id);
    }

    public int updateStudentById(String id, Student newStudent) {

        return studentDao.updateStudentById(id, newStudent);
    }

}
