package com.loan.mfi.master.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.mfi.master.main.model.BankDetails;
import com.loan.mfi.master.main.model.Branch;
import com.loan.mfi.master.main.model.Role;
import com.loan.mfi.master.main.repository.BankRepository;
import com.loan.mfi.master.main.repository.BranchRepository;
import com.loan.mfi.master.main.repository.RoleRepository;

@Service
public class ServiceImpl implements ServiceI 
{
	@Autowired
	BankRepository br;
	
	@Autowired
	BranchRepository bh;
	
	@Autowired
	RoleRepository rr;

	@Override
	public void addAllData(BankDetails bdetails) 
	{
		br.save(bdetails);
		
	}

	@Override
	public void addBranchData(Branch branch) {
		bh.save(branch);
		
	}

	@Override
	public void addRoleData(Role role) {
		rr.save(role);
		
	}

	
	  @Override public void addBranchwithBankDetails(Branch branch, String bname) 
	  {
	  BankDetails bdetails = br.findByBname(bname); 
	  branch.setBdetails(bdetails);
	  bh.save(branch); 
	  }
	  
	  @Override public void addRolewithBranch(Role role, String brname) 
	  { 
		  Branch branch =bh.findByBrname(brname); 
		  role.setBranch(branch);
		  rr.save(role);
	  
	  }

	@Override
	public void deletebank(int id) {
		br.deleteById(id);
		
	}

	@Override
	public void deleteBranch(int id) {
		bh.deleteById(id);
		
	}

	@Override
	public void deleteRole(int id) {
		rr.deleteById(id);
		
	}
	 

}
