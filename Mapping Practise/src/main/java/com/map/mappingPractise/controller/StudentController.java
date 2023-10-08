package com.map.mappingPractise.controller;

import com.map.mappingPractise.model.Student;
import com.map.mappingPractise.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public void createStudent(@Valid @RequestBody Student student){
        studentService.createStudent(student);
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("student/{studentId}/{studentDepartment}")
    public String updateStudentDepartment(@PathVariable String studentId, @PathVariable String studentDepartment){
        return studentService.updateStudentDepartment(studentId,studentDepartment);
    }

    @DeleteMapping("student/{studentId}")
    public String deleteStudent(@PathVariable String studentId){
        return studentService.deleteStudent(studentId);
    }
}