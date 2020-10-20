package com.loan.mfi.master.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.mfi.master.main.model.BankDetails;
import com.loan.mfi.master.main.service.ServiceI;

@RestController
@CrossOrigin("*")
public class BankController 
{
	@Autowired
	ServiceI s;
	
	@GetMapping("/getBankData")
	public List<BankDetails> display()
	{
		List<BankDetails> blist =s.getBankDetails();
		return blist;
	}

}
