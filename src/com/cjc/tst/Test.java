package com.cjc.tst;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.cjc.Demo.Demo;

public class Test {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\W10\\Desktop","Student_Data_Management");
		f.mkdir();
		Demo d=new Demo();
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter 1 to store Student data:");
		System.out.println("Enter 2 to getData:");
		System.out.println("enter 3 to exist");
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1:
			d.studentdata();
			break;
			
		case 2:
			d.getData();
			break;
			
		case 3:
			System.exit(0);
			break;
			
		default :
			System.out.println("enter correct details :");
		
		}
	}
}
}
