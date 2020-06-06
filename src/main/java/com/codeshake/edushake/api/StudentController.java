package com.codeshake.edushake.api;

import com.codeshake.edushake.model.Student;
import com.codeshake.edushake.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("codeshake/students")
@RestController
public class StudentController {

    private final StudentService studentService;

    /*private static String token = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJzeW5jLW9yZ2FuaXphdGlvbiIsInN1YiI6Ikd" +
            "pemVtIEVsaWYgQXRhbGF5IiwibnMiOiI2ZjYzMDg4My05NzI1LTQ1NzQtODJlMi1mMjg4ZDM0MTVmYTAiLCJpc3MiOiJjb2Rlc2hha2UuaW8iLC" +
            "JpYXQiOjE1OTExNzY4ODYsImV4cCI6MTU5MjA0MDg4Nn0.wWuKW3dYx2OY8WtQkqSEGZjzAVhhIx2wd-KhkRVcNPR70gP9fCSc-8RhuEN2" +
            "l5MX0n50aHZcvkMfunBngvP_YLj5jMT9Gqf3onS1Cwiv4Fi13a48kWOQXmX7LzJwA4yANmyHbEq1wYTOXbefWCgnUnCUfIIYQsqwm508Yt" +
            "Fa1BGkesKrIBMEQymCVKbMMpQWYKUZ3x_m68UwHTI7ePyXXf0ucRR_oz90GUOvA8ID2hmHDN2t5vtA8bFjSmyXK3mEBQbvQkVpQ-FCMjg5f" +
            "ko9Yf1R3Gt3oGDv3RS6tXGB6Kt5inrCGyIq0nsFZwLAYY-sav6Toi3wzo3RC25E9K2dPw";*/

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("insertStudent")
    public void addStudent(@Valid @NonNull @RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "{id}")
    public Student getStudentById(@PathVariable("id") String id) {
        return studentService.getStudentById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteStudentById(@PathVariable("id") String id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "{id}")
    public void updateStudent(@PathVariable("id") String id, @Valid @NonNull @RequestBody Student studentToUpdate) {
        studentService.updateStudentById(id, studentToUpdate);
    }
}
