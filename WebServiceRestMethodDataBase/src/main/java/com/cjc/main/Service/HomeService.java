package com.cjc.main.Service;

import com.cjc.main.model.Student;

public interface HomeService {

	public Iterable<Student>retriveData();
	
	public Student insertData(Student s);
	
	public Student updatedata(Student s,int rollno);
	
	public void deleteData(int rollno);
	
}
