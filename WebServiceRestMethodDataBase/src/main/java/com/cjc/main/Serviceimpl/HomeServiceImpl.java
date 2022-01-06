package com.cjc.main.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	
	@Override
	public Iterable<Student> retriveData() {
		
		return hr.findAll();
	}

	@Override
	public Student insertData(Student s) {
		
		return hr.save(s);
		
	}

	@Override
	public Student updatedata(Student s , int rollno) {
		
		Student ss=hr.findByrollno(rollno);
		ss.setName(s.getName());
		ss.setAddress(s.getAddress());
		ss.setMobileno(s.getMobileno());
		
		return hr.save(ss);
	}

	@Override
	public void deleteData(int rollno) {
		
		hr.deleteById(rollno);
		
	}

	
}
