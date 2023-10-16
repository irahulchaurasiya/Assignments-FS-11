package com.insta.InstagramBackend.repository;

import com.insta.InstagramBackend.model.Post;
import com.insta.InstagramBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepo extends JpaRepository<Post, Integer> {


    List<Post> findByUser(User user);
}