package com.codeshake.edushake.api;

import com.codeshake.edushake.model.Student;
import com.codeshake.edushake.model.Teacher;
import com.codeshake.edushake.service.StudentService;
import com.codeshake.edushake.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("source/codeshake")
@RestController
public class StudentController {

    private final StudentService studentService;
    private final TeacherService teacherService;

    @Autowired
    public StudentController(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @PostMapping("students/insertStudent")
    public void addStudent(@Valid @NonNull @RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "students/{id}")
    public Student getStudentById(@PathVariable("id") String id) {
        return studentService.getStudentById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "students/{id}")
    public void deleteStudentById(@PathVariable("id") String id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "students/{id}")
    public void updateStudent(@PathVariable("id") String id, @Valid @NonNull @RequestBody Student studentToUpdate) {
        studentService.updateStudentById(id, studentToUpdate);
    }

    @PostMapping("teachers/insertTeacher")
    public void addTeacher(@Valid @NonNull @RequestBody Teacher teacher) { teacherService.addTeacher(teacher); }

    @GetMapping("teachers")
    public List<Teacher> getAllTeachers() { return teacherService.getAllTeachers(); }

    @GetMapping(path = "teachers/{id}")
    public Teacher getTeacherById(@PathVariable("id") String id) {
        return teacherService.getTeacherById(id)
                .orElse(null);
    }
}
