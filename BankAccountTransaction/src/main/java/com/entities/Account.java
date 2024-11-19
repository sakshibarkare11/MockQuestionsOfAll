package com.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Provide necessary Annotation
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Account {
	
	//Provide necessary Annotation

	@Id
	private String accountNumber;
	private String holderName;
	private String phoneNumber;
	private String panNumber;
	private String accountType; //Savings or Current
	private double balanceAmount;
	
	@OneToMany(mappedBy = "accountObj")
//	@JsonProperty(access= Access.WRITE_ONLY)
	List<BankTransaction> transactions;
	
	public Account()
	    {
	        super();
	    }
	
}
