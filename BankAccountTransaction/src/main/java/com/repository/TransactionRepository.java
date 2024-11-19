package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.BankTransaction;

//Provide necessary Annotation
@Repository
public interface TransactionRepository extends JpaRepository<BankTransaction, String> {

	//Provide necessary method to view transactions based on transaction type 
	List<BankTransaction> findByTransactionType(String transactionType);
	//	public List<BankTransaction> viewTransactionByTransactionType(String transactionType);

	
}