package com.main.model;

import java.util.Comparator;

public class StudentCom2 implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return o1.getSid() - o2.getSid();
	}

}
