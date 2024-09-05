package com.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.modal.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

    User findByEmailid(String emailid);
    User findByUsername(String username);
}


