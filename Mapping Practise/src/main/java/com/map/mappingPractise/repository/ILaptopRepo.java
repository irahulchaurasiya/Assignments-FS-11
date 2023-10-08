package com.map.mappingPractise.repository;

import com.map.mappingPractise.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop , String> {
}
