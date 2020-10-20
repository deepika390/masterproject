package com.loan.mfi.master.main.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Branch 
{
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int branch_id;
	   private String brname;
	   private String branch_type;
	   private String branch_ifsc;
	   private String branch_mfsc;
	   private long branch_phno;
	   private String branch_email;
	   private String branch_address;
	   private int branch_status;
	   @ManyToOne
	   @JoinColumn(name = "bid")
	   private BankDetails bdetails;
	   @OneToMany(cascade = CascadeType.ALL)
	   private List<Role> rlist=new ArrayList<Role>();
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public String getBrname() {
		return brname;
	}
	public void setBrname(String brname) {
		this.brname = brname;
	}
	public String getBranch_type() {
		return branch_type;
	}
	public void setBranch_type(String branch_type) {
		this.branch_type = branch_type;
	}
	public String getBranch_ifsc() {
		return branch_ifsc;
	}
	public void setBranch_ifsc(String branch_ifsc) {
		this.branch_ifsc = branch_ifsc;
	}
	public String getBranch_mfsc() {
		return branch_mfsc;
	}
	public void setBranch_mfsc(String branch_mfsc) {
		this.branch_mfsc = branch_mfsc;
	}
	public long getBranch_phno() {
		return branch_phno;
	}
	public void setBranch_phno(long branch_phno) {
		this.branch_phno = branch_phno;
	}
	public String getBranch_email() {
		return branch_email;
	}
	public void setBranch_email(String branch_email) {
		this.branch_email = branch_email;
	}
	public String getBranch_address() {
		return branch_address;
	}
	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}
	public int getBranch_status() {
		return branch_status;
	}
	public void setBranch_status(int branch_status) {
		this.branch_status = branch_status;
	}
	public BankDetails getBdetails() {
		return bdetails;
	}
	public void setBdetails(BankDetails bdetails) {
		this.bdetails = bdetails;
	}
	public List<Role> getRlist() {
		return rlist;
	}
	public void setRlist(List<Role> rlist) {
		this.rlist = rlist;
	}
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", brname=" + brname + ", branch_type=" + branch_type
				+ ", branch_ifsc=" + branch_ifsc + ", branch_mfsc=" + branch_mfsc + ", branch_phno=" + branch_phno
				+ ", branch_email=" + branch_email + ", branch_address=" + branch_address + ", branch_status="
				+ branch_status + ", bdetails=" + bdetails + ", rlist=" + rlist + "]";
	}
	   
	   
	   
	   
	
	
}
