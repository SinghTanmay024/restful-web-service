package com.example.restful_web_service.jpa;

import com.example.restful_web_service.helloworld.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
