package com.loan.mfi.master.main.service;

import java.util.List;

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
	public List<BankDetails> getBankDetails() {
		List<BankDetails> blist = br.findAll();
		return blist;
	}

	@Override
	public List<Branch> getBranchDetails() {
		List<Branch> brlist = bh.findAll();
		return brlist;
	}

	@Override
	public List<Role> getRoleDetails() {
		List<Role> rlist=rr.findAll();
		return rlist;
	}

	/*
	 * @Override public List<Role> getRolewithBranch(String brname) { Branch b =
	 * bh.findByBranch_Name(brname); List<Role> rlist
	 * =rr.findByBranch_id(b.getBranch_id()); return rlist; }
	 */

	/*
	 * @Override public List<Branch> getBranchwithBank(String bname) { BankDetails
	 * bdetails=br.findByBname(bname); List<Branch> elist=; return elist; }
	 */
	

}
