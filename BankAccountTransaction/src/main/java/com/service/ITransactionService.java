package com.service;

import java.util.List;

import com.entities.BankTransaction;

public interface ITransactionService {

	public BankTransaction insertTransaction(BankTransaction transactionObj,String accountNumber);
	
	public List<BankTransaction> viewTransactionByTransactionType(String transactionType);
	


}
