package com.uem.UniversityEventManagement.repository;


import com.uem.UniversityEventManagement.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event , Long> {
    List<Event> findAllByDate(LocalDate date);
}
