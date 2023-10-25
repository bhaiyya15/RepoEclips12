package com.main.controller;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.main.model.Student2;
import com.main.model.StudentCom2;
import com.main.servicei.Servicei;



@RestController
public class HomeController {
	
	
	
	
	@Autowired
	Servicei se;
	
	@RequestMapping("/getData1")
	public List getdata()
	{
		Student2 s1=new Student2();
		s1.setSid(69);
		s1.setSname("akash");
		s1.setCourse("python");
		
		
		Student2 s2=new Student2();
		s2.setSid(29);
		s2.setSname("sam");
		s2.setCourse("java");
		
		Student2 s3=new Student2();
		s3.setSid(99);
		s3.setSname("Ravindra");
		s3.setCourse("c");
		
		Student2 s4=new Student2();
		s4.setSid(45);
		s4.setSname("arshdeep");
		s4.setCourse("cpp");
		
		Student2 s5=new Student2();
		s5.setSid(78);
		s5.setSname("shreyas");
		s5.setCourse("java");
		
		Student2 s6=new Student2();
		s6.setSid(25);
		s6.setSname("ashwin");
		s6.setCourse("ruby");
		
		Student2 s7=new Student2();
		s7.setSid(556);
		s7.setSname("rohit");
		s7.setCourse(".net");
		
		Student2 s8=new Student2();
		s8.setSid(01);
		s8.setSname("virat");
		s8.setCourse("java");
		
		List al=new ArrayList();
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		al.add(s4);
//		al.add(s5);
//		al.add(s6);
//		al.add(s7);
//		al.add(s8);
		
		
		
		Student2 a[]=new Student2[8];
		a[0]=s1;
		a[1]=s2;
		a[2]=s3;
		a[3]=s4;
		a[4]=s5;
		a[5]=s6;
		a[6]=s7;
		a[7]=s8;
		
		for(int i=0;i<8;i++)
		{
			if(a[i].getCourse()=="java")
			{
				System.out.println(a[i].getSid());
				System.out.println(a[i].getSname());
				System.out.println(a[i].getCourse());
				
				al.add(a[i]);
				
				Collections.sort(al,new StudentCom2());
				
			}
		}
		
		
		return al;
				
	}

	
	@PostMapping("/savedata")
	public String SaveData(@RequestBody Student2 s)
	{
		se.saveData(s);
		return "SaveSuccefully";
	}
	
	
	
}
