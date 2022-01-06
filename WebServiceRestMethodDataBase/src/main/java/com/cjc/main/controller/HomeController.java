package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Student;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@RequestMapping(value="/getAllData",method=RequestMethod.GET)
	public Iterable<Student>retriveData() {
		
		Iterable<Student>list=hs.retriveData();
		
		return list ;
	}
	
	@RequestMapping(value="/insertdata",method=RequestMethod.POST)
	public Student insertdata(@RequestBody Student s) {
		
		Student ss=hs.insertData(s);
		
		return ss;
	
	}
	@RequestMapping(value="/updatePutData/{rollno}",method=RequestMethod.PUT)
	public Student UpdateData(@RequestBody Student s,@PathVariable("rollno")int rollno) {
		
		Student ss=hs.updatedata(s, rollno);
		
		return ss;
		
	}
	
	@RequestMapping(value="/updatePatch/{rollno}",method=RequestMethod.PATCH)
	public Student updatePatch(@RequestBody Student s,@PathVariable("rollno")int rollno) {
		
		Student ss=hs.updatedata(s, rollno);
		return ss;
		
		
	}
	@RequestMapping(value="/deleteData/{rollno}",method=RequestMethod.DELETE)
	public void deleteData(@PathVariable("rollno")int rollno) {
		
		System.out.println("deleted successfully");
		hs.deleteData(rollno);
	}
	
	
}
