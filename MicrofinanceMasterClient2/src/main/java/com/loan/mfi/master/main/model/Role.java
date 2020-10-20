package com.loan.mfi.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Role 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	private String rname;
	private String rdesc;
	private int rstatus;
	@ManyToOne
	@JoinColumn(name = "branch_id")
	private Branch branch;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRdesc() {
		return rdesc;
	}
	public void setRdesc(String rdesc) {
		this.rdesc = rdesc;
	}
	public int getRstatus() {
		return rstatus;
	}
	public void setRstatus(int rstatus) {
		this.rstatus = rstatus;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", rdesc=" + rdesc + ", rstatus=" + rstatus + ", branch="
				+ branch + "]";
	}
	
	
}
