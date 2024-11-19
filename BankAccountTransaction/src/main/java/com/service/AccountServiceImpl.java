package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IAccountDAO;
import com.entities.Account;

//Provide necessary Annotation
@Service
public class AccountServiceImpl implements IAccountService {
	
	//Provide necessary Annotation
	@Autowired
	IAccountDAO accountDAO;

	@Override
	public Account openAccount(Account account) {
		//fill code
		return accountDAO.openAccount(account);
	}
	
	@Override
	public Account viewAccountByAccountNumber(String accountNumber){
		//fill code
		return accountDAO.viewAccountByAccountNumber(accountNumber);		
	}

}
/**/

//Rest service call for veiwTransactionByTransactionType works as expected -8
//insertTransaction(Deposit) method in the TransactionDAOImpl class along with updation of balance in acc-9
//insertTransaction(Withdraw) method in the TransactionDAOImpl class along with updation of balance in acc-9
//21+24+29=50+24=74
//13+8+24(8)+27+2=58
//13+8+32+45+2=100