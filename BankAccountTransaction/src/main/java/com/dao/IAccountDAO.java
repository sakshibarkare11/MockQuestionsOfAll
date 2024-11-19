package com.dao;

import java.util.List;

import com.entities.Account;

public interface IAccountDAO {
	
	public Account openAccount(Account account);
	public Account viewAccountByAccountNumber(String accountNumber);

	

}
