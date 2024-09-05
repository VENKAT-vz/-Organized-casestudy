package com.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.modal.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

}
