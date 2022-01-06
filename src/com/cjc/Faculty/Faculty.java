package com.cjc.Faculty;

import com.cjc.Course.Course;

public class Faculty {

	int fid;
	String fname;
	Course fcourse;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getFcourse() {
		return fcourse;
	}
	public void setFcourse(Course fcourse) {
		this.fcourse = fcourse;
	}
}
