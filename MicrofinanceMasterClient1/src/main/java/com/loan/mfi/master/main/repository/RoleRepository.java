package com.loan.mfi.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.mfi.master.main.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
