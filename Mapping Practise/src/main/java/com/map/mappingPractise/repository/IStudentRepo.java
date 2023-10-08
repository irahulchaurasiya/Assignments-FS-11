package com.map.mappingPractise.repository;

import com.map.mappingPractise.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student , String> {
}
