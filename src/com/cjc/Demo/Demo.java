package com.cjc.Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.cjc.Batch.Batch;
import com.cjc.Course.Course;
import com.cjc.Faculty.Faculty;
import com.cjc.Student.Student;

public class Demo {

	Scanner sc=new Scanner(System.in);
	
	Student sa[]=new Student[100];
	int count=0;
	
	public void studentdata() throws IOException {
		
		while(true) {
			
			Student s=new Student();
			Batch b=new Batch();
			Faculty f=new Faculty();
			Course c=new Course();
			
			System.out.println("Enter Student id;");
			int sid=sc.nextInt();
			s.setSid(sid);
			
			System.out.println("Enter Student name:");
			String sname=sc.next();
			s.setName(sname);
			
			System.out.println("-------------batch details-----------");
			s.setSbatch(b);
			
			System.out.println("Enter batch Id");
			int bid=sc.nextInt();
			b.setBid(bid);
			
			System.out.println("Enter Batch name:");
			String bname=sc.next();
			b.setBname(bname);
			
			System.out.println("---------Faculty details-------------");
			b.setBfaculty(f);
			
			System.out.println("Enter Faculty id:");
			int fid=sc.nextInt();
			f.setFid(fid);
			
			System.out.println("Enter Faculty name:");
			String fname=sc.next();
			f.setFname(fname);
			
			System.out.println("----------Course details------");
			f.setFcourse(c);
			
			System.out.println("Enter Course id:");
			int cid=sc.nextInt();
			c.setCid(cid);
			
			System.out.println("Enter Cousrse name:");
			String cname=sc.next();
			c.setCname(cname);
			
			File f1=new File("C:\\Users\\W10\\Desktop\\Student_Data_Management",sname+".txt");
			f1.createNewFile();		
			
			FileWriter fw=new FileWriter(f1);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Student id:"+sid);
			bw.newLine();
			bw.write("Student name:"+sname);
			bw.newLine();
			bw.write("Batch id:"+bid);
			bw.newLine();
			bw.write("Batch name:"+bname);
			bw.newLine();
			bw.write("Faculty id:"+fid);
			bw.newLine();
			bw.write("Faculty name:"+fname);
			bw.newLine();
			bw.write("Course id:"+cid);
			bw.newLine();
			bw.write("Course name:"+cname);
			bw.flush();
			
			sa[count]=s;
			count++;
			
			System.out.println("Enter 1 to add /0 to exist:");
			int s1=sc.nextInt();
			
			if(s1==0) {
				break;
			}
		}
	}
	
	public void getData() throws IOException {
		
		/*for(int i=0;i<count;i++) {
			
			System.out.println(sa[i].getSid());
			System.out.println(sa[i].getName());
			System.out.println(sa[i].getSbatch().getBid());
			System.out.println(sa[i].getSbatch().getBname());
			System.out.println(sa[i].getSbatch().getBfaculty().getFid());
			System.out.println(sa[i].getSbatch().getBfaculty().getFname());
			System.out.println(sa[i].getSbatch().getBfaculty().getFcourse().getCid());
			System.out.println(sa[i].getSbatch().getBfaculty().getFcourse().getCname());
		}*/
		
		File f=new File("C:\\Users\\W10\\Desktop\\Student_Data_Management");
		
		String li[]=f.list();
		
		for(int i=0; i<li.length;i++) {
			
			String sname=li[i];
			System.out.println("content of " +sname);
			
			FileReader fr=new FileReader("C:\\Users\\W10\\Desktop\\Student_Data_Management\\" +sname);
			BufferedReader br=new BufferedReader(fr);
			
			String s1=br.readLine();
			
			while(s1 !=null) {
				System.out.println(s1);
				s1=br.readLine();
			}
			System.out.println("___________________________");
		}
	}
}
