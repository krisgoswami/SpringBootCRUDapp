package com.krish.mysqlcrudapp.repository;

import com.krish.mysqlcrudapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
}
