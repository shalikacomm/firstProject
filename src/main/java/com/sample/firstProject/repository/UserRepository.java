package com.sample.firstProject.repository;

import com.sample.firstProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {



 }
