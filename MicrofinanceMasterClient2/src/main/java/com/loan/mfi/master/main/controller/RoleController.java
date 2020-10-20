package com.loan.mfi.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.mfi.master.main.model.Role;
import com.loan.mfi.master.main.service.ServiceI;

@RestController
@CrossOrigin("*")
public class RoleController
{
	@Autowired
	ServiceI s;
	
	@GetMapping("/getRoleData")
	public List<Role> display()
	{
		List<Role> rlist =s.getRoleDetails();
		return rlist;
	}


}
