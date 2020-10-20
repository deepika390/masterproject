package com.loan.mfi.master.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.loan.mfi.master.main.model.Role;
import com.loan.mfi.master.main.service.ServiceI;

@RestController
@CrossOrigin("*")
public class RoleController 
{
	@Autowired
	ServiceI s;
	
	@PostMapping("/addRole")
	public String insertData(@RequestBody Role role)
	{
		System.out.println(role);
		s.addRoleData(role);
		return "Data Inserted";
	}
	
	
	  @PostMapping("/addRole/{brname}") 
	  public String adddata(@RequestBody Role role,@PathVariable ("brname") String brname) 
	  {
	  System.out.println("Data : "+role +" "+brname);
	  s.addRolewithBranch(role, brname);
	  return "Role Inserted"; 
	  }

	  @DeleteMapping("/deleteRole/{rid}")
		public String deleteData(@PathVariable ("rid") int rid)
		{
			s.deleteRole(rid);
			return "data deleted";
		}
}
