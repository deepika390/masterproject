package com.loan.mfi.master.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.mfi.master.main.model.Branch;
import com.loan.mfi.master.main.service.ServiceI;

@RestController
@CrossOrigin("*")
public class BranchController 
{
	@Autowired
	ServiceI s;
	
	@PostMapping("/addBranch")
	public String inserbr(@RequestBody Branch branch)
	{
		System.out.println("Data "+branch);
		s.addBranchData(branch);
		return "Data Inserted";
	}

	
	  @PostMapping("/addBranch/{bname}") public String m1(@RequestBody Branch branch,@PathVariable("bname")String bname)
	  { 
		  System.out.println("Branch :" +branch+"   "+bname); 
		  s.addBranchwithBankDetails(branch, bname); 
		  return "Branch inserted"; 
	}
	  @DeleteMapping("/deletBranch/{branch_id}")
		public String deleteData(@PathVariable ("branch_id") int branch_id)
		{
			s.deleteBranch(branch_id);
			return "data deleted";
		}
}
