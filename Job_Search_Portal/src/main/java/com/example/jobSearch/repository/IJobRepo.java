package com.example.jobSearch.repository;

import com.example.jobSearch.model.Job;
import com.example.jobSearch.model.Type;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job , Long> {
    List<Job> findByTitle(String title);

    List<Job> findByDescription(String description);

}
