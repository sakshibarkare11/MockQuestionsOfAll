package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.entities.Account;
import com.repository.AccountRepository;

@Component
public class AccountDAOImpl implements IAccountDAO{
	
	//Provide code to Inject AccountRepository
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account openAccount(Account account) {
		//fill code
		return accountRepository.save(account);
	}
	
	@Override
	public Account viewAccountByAccountNumber(String accountNumber) {
		//fill code
		return accountRepository.findById(accountNumber).orElse(null);	
	}



}
