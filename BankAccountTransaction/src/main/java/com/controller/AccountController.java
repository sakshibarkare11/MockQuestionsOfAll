package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Account;
import com.service.IAccountService;

//Provide necessary Annotation
@RestController
public class AccountController {
	
	//Provide necessary Annotation
	@Autowired
	IAccountService accountService;
	
	//Provide necessary Annotation and fill code
	@PostMapping("/openAccount")
	public  Account openAccount(@RequestBody Account account) {
	
		return accountService.openAccount(account);
		
	}
	
	@GetMapping("/viewAccountByAccountNumber/{accountNumber}")
	public Account viewAccountByAccountNumber(@PathVariable String accountNumber) {
	
		return accountService.viewAccountByAccountNumber(accountNumber);
		
	}
}

	
