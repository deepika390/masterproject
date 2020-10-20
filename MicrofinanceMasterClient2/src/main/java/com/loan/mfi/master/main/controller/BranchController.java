package com.loan.mfi.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


import com.loan.mfi.master.main.model.Branch;
import com.loan.mfi.master.main.service.ServiceI;

@RestController
@CrossOrigin("*")
public class BranchController 
{
	@Autowired
	ServiceI s;
	
	@GetMapping("/getBranchData")
	public List<Branch> display()
	{
		List<Branch> blist =s.getBranchDetails();
		return blist;
	}

	/*
	 * @GetMapping("/getBranchData/{bname}") public List<Branch>
	 * getdata(@PathVariable ("bname") String bname) {
	 * 
	 * }
	 */
	
}
