package com.loan.mfi.master.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.mfi.master.main.model.BankDetails;
import com.loan.mfi.master.main.service.ServiceI;

@RestController
@CrossOrigin("*")
public class BankController 
{
	@Autowired
	ServiceI s;
	
	@PostMapping("/addBank")
	public String insertData(@RequestBody BankDetails bdetails)
	{
		System.out.println(bdetails);
		s.addAllData(bdetails);
		return "Data Inserted";
	}

	
	@DeleteMapping("/deleteBank/{bid}")
	public String deleteData(@PathVariable ("bid") int bid)
	{
		s.deletebank(bid);
		return "data deleted";
	}
}
