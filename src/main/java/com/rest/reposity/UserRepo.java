package com.rest.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
