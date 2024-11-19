package com.dao;

import java.util.List;

import com.entities.BankTransaction;

public interface ITransactionDAO {

	public BankTransaction insertTransaction(BankTransaction transactionObj,String accountNumber);
	
	public List<BankTransaction> viewTransactionByTransactionType(String transactionType);
	
	
	
	
	
	
}
