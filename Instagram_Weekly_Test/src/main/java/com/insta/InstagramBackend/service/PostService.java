package com.insta.InstagramBackend.service;

import com.insta.InstagramBackend.model.Post;
import com.insta.InstagramBackend.model.User;
import com.insta.InstagramBackend.repository.ITokenRepo;
import com.insta.InstagramBackend.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;

    @Autowired
    ITokenRepo tokenRepo;
    public void addPost(Post post) {
        postRepo.save(post);
    }

    public List<Post> getAllPosts(String token) {
        User user = tokenRepo.findFirstByToken(token).getUser();


        List<Post> postList = postRepo.findByUser(user);

        return postList;


    }

}
