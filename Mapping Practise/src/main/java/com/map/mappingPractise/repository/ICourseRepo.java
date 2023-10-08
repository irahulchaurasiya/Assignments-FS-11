package com.map.mappingPractise.repository;

import com.map.mappingPractise.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course , String> {
}
