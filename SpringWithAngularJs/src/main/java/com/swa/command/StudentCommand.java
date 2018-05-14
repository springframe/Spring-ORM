package com.swa.command;

public class StudentCommand {
	private int sno;
	private String fname;
	private String lname;
	private String email;
	private String adress;
	private long mbno;
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	@Override
	public String toString() {
		return "StudentCommand [sno=" + sno + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", adress="
				+ adress + ", mbno=" + mbno + "]";
	}

}
