package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ITransactionDAO;
import com.entities.BankTransaction;

//Provide necessary Annotation
@Service
public class TransactionServiceImpl implements ITransactionService {

	//Provide necessary Annotation
	@Autowired
	ITransactionDAO transactionDAO;

	@Override
	public BankTransaction insertTransaction(BankTransaction transactionObj,String accountNumber) {
		//fill code
		return transactionDAO.insertTransaction(transactionObj, accountNumber);
	}
	
	@Override
	public List<BankTransaction> viewTransactionByTransactionType(String transactionType)
	{
		//fill code
		return transactionDAO.viewTransactionByTransactionType(transactionType);
	}
	


}
