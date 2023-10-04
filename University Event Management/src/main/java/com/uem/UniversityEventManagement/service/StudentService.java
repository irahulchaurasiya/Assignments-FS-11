package com.uem.UniversityEventManagement.service;

import com.uem.UniversityEventManagement.model.Department;
import com.uem.UniversityEventManagement.model.Student;
import com.uem.UniversityEventManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student added successfully!";
    }

    public String updateStudentDepartment(Long id, Department department) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setDepartment(department);
            studentRepository.save(student);
            return "Student department updated successfully!";
        } else {
            return "Student not found!";
        }
    }

    public String deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Student deleted successfully!";
        } else {
            return "Student not found!";
        }
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
