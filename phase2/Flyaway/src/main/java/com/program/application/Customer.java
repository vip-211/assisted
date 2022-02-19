package com.program.application;


import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String  cname;
	private String clname;
	private String cage;
	private String cemail;
	private String cgender;
	private String cphoneno;
	private String cpassword;
	
	
	public Customer() {
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getCage() {
		return cage;
	}

	public void setCage(String age) {
		this.cage = age;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCgender() {
		return cgender;
	}

	public void setCgender(String gender) {
		this.cgender = gender;
	}

	public String getCphoneno() {
		return cphoneno;
	}

	public void setCphoneno(String cphoneno) {
		this.cphoneno = cphoneno;
	}

	@Override
	public String toString() {
		return "Customer [Customername=" + cname + ", clname=" + clname + ", cage=" + cage + ", cemail=" + cemail
				+ ", cgender=" + cgender + ", cphoneno=" + cphoneno + " , cpassword=" + cpassword +"]";
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
		
		
	}
	
	
	

	
	

	
	


