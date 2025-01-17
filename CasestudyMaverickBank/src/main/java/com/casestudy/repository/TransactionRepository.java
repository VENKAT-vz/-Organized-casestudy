package com.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.modal.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}