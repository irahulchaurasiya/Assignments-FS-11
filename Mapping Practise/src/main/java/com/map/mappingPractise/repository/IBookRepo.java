package com.map.mappingPractise.repository;

import com.map.mappingPractise.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book , String> {
}
