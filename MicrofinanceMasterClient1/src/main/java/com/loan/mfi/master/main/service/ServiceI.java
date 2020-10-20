package com.loan.mfi.master.main.service;

import com.loan.mfi.master.main.model.BankDetails;
import com.loan.mfi.master.main.model.Branch;
import com.loan.mfi.master.main.model.Role;

public interface ServiceI 
{
	public void addAllData(BankDetails bdetails);
	
	public void addBranchData(Branch branch);
	
	public void addRoleData(Role role);
	
	
	  public void addBranchwithBankDetails(Branch branch,String bname);
	  
	  public void addRolewithBranch(Role role,String branch_name);
	  
	  public void deletebank(int id);
	  
	  public void deleteBranch(int id);
	  
	  public void deleteRole(int id);
	 

}
