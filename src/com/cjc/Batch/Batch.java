package com.cjc.Batch;

import com.cjc.Faculty.Faculty;

public class Batch {

	int bid;
	String bname;
	Faculty bfaculty;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Faculty getBfaculty() {
		return bfaculty;
	}
	public void setBfaculty(Faculty bfaculty) {
		this.bfaculty = bfaculty;
	}
	
}
