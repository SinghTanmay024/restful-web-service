package com.example.restful_web_service.jpa;

import com.example.restful_web_service.helloworld.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
