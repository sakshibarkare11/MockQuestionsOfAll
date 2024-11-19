package com.service;

import org.springframework.stereotype.Service;

import com.entities.Account;
@Service
public interface IAccountService {
	
	public Account openAccount(Account account);
	public Account viewAccountByAccountNumber(String accountNumber);


}
