package com.softmin.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_student")
public class StudentEntity {
	@Id
	@GenericGenerator(strategy = "increment", name = "stdGen")
	@GeneratedValue(generator = "stdGen")
	@Column(name = "s_name", length = 10)
	private int sno;
	@Column(name = "f_name")
	private String fname;
	@Column(name = "l_name")
	private String lname;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;
	@Column(name = "mobile_no")
	private long mobileno;

	// setter and getter
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "StudentEntity [sno=" + sno + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", address="
				+ address + ", mobileno=" + mobileno + "]";
	}

}
