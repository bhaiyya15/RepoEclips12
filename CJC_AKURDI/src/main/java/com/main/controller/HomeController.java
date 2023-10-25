package com.main.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student1;
import com.main.model.StudentCom;


@RestController
public class HomeController {
	
	
	
	@RequestMapping("/getData")
	public List getdata()
	{
		Student1 s1=new Student1();
		s1.setSid(101);
		s1.setSname("akash");
		s1.setCourse("python");
		
		
		Student1 s2=new Student1();
		s2.setSid(99);
		s2.setSname("sam");
		s2.setCourse("java");
		
		Student1 s3=new Student1();
		s3.setSid(89);
		s3.setSname("Ravindra");
		s3.setCourse("c");
		
		Student1 s4=new Student1();
		s4.setSid(22);
		s4.setSname("arshdeep");
		s4.setCourse("cpp");
		
		Student1 s5=new Student1();
		s5.setSid(36);
		s5.setSname("shreyas");
		s5.setCourse("java");
		
		Student1 s6=new Student1();
		s6.setSid(77);
		s6.setSname("ashwin");
		s6.setCourse("ruby");
		
		Student1 s7=new Student1();
		s7.setSid(55);
		s7.setSname("rohit");
		s7.setCourse(".net");
		
		Student1 s8=new Student1();
		s8.setSid(123);
		s8.setSname("virat");
		s8.setCourse("java");
		
		List al=new ArrayList();
		
		
		
		Student1 a[]=new Student1[8];
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
				
				Collections.sort(al,new StudentCom());
				
				
				
				
				
				
				
			}
		}
	
		
		
		return al;
	}

}
//Student1 a[]=new Student1[2];
//
//a[0]=s1;
//a[1]=s2;
//
//List l=new ArrayList();
//
//for(int i=0;i<2;i++)
//{
//	if(a[i].getMarks()>50)
//	{
//	System.out.println(a[i].getSid());
//	System.out.println(a[i].getSname());
//	System.out.println(a[i].getSaddr());
//	System.out.println(a[i].getMarks());
//			
//	
//	l.add(a[i]);
//	
//	}
//	
//}