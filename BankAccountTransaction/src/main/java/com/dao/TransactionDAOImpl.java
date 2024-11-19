package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Account;
import com.entities.BankTransaction;
import com.repository.AccountRepository;
import com.repository.TransactionRepository;

@Component
public class TransactionDAOImpl implements ITransactionDAO {
	
	//Provide code to Inject TransactionRepository and AccountRepository
	//Provide code to Inject AccountRepository, if needed
	@Autowired
	private TransactionRepository transactionRepo;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public BankTransaction insertTransaction(BankTransaction transactionObj,String accountNumber){
		//fill code
		Optional<Account> op = accountRepository.findById(accountNumber);
		if(op.isPresent()) {
			Account acc= op.get();
			
			if(transactionObj.getTransactionType().equalsIgnoreCase("Deposit")) {
				acc.setBalanceAmount(acc.getBalanceAmount()+transactionObj.getAmount());
			}
			
			else if(transactionObj.getTransactionType().equalsIgnoreCase("Withdraw")) {
			}
		}	
		return null;
	}
	
	@Override
	public List<BankTransaction> viewTransactionByTransactionType(String transactionType)
	{
		//fill code
		return transactionRepo.findByTransactionType(transactionType);	
	}
	


}
