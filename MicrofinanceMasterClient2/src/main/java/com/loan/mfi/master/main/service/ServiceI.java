package com.loan.mfi.master.main.service;

import java.util.List;

import com.loan.mfi.master.main.model.BankDetails;
import com.loan.mfi.master.main.model.Branch;
import com.loan.mfi.master.main.model.Role;

public interface ServiceI 
{
	public List<BankDetails> getBankDetails();
	
	public List<Branch> getBranchDetails();
	
	public List<Role> getRoleDetails();
	
	/* public List<Branch> getBranchwithBank(String bname); */
	
	/* public List<Role> getRolewithBranch(String brname); */

}
