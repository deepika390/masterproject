package com.loan.mfi.master.main.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.mfi.master.main.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{
	
	/*
	 * List<Branch> findByBid(int bid);
	 * 
	 * Branch findByBranch_Name(String brname);
	 */
}
