package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Provide necessary Annotation
@Entity
@Setter
@Getter
@AllArgsConstructor
public class BankTransaction {

	//Provide necessary Annotation
	@Id
	private String transactionId;
	private String transactionDate;
	private String transactionType;//Deposit or Withdraw
	private double amount;
	
	@ManyToOne
	@JoinColumn(name= "accountNumber")
	private Account accountObj;
	
	 public BankTransaction() {
        super();
    }
	
}
