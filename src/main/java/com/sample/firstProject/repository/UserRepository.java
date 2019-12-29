package com.sample.firstProject.repository;

import com.sample.firstProject.entity.PaymentTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<PaymentTable,Integer> {



 }
