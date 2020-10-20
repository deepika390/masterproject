package com.loan.mfi.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.mfi.master.main.model.BankDetails;

@Repository
public interface BankRepository extends JpaRepository<BankDetails, Integer> {

	BankDetails findByBname(String bname);
}
