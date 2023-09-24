package com.example.userManagementSystem.repository;

import com.example.userManagementSystem.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User, Long> {
}
