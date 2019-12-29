package com.sample.firstProject.repository;

import com.sample.firstProject.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {


    UserRole findByName(final String name);

}
