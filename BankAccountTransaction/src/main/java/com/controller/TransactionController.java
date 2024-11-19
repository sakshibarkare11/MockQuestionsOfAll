package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.BankTransaction;
import com.service.ITransactionService;

//Provide necessary Annotation
@RestController
public class TransactionController {
	
	//Provide necessary Annotation
	@Autowired
	ITransactionService transactionService;

	//Provide necessary Annotation and fill code
	@PostMapping("/insertTransaction/{accountNumber}")
	public BankTransaction insertTransaction(String accountNumber,BankTransaction transactionObj)  {
		return transactionService.insertTransaction(transactionObj, accountNumber);
	}
	
	@GetMapping("/viewTransactionByTransactionType/{transactionType}")
	public List<BankTransaction> viewTransactionByTransactionType(String transactionType)
	{
		return transactionService.viewTransactionByTransactionType(transactionType);
	}
	


}
