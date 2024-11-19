package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Account;

//Provide necessary Annotation
@Repository
public interface AccountRepository extends JpaRepository<Account, String>{
	
	

}