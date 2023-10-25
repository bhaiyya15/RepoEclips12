package com.main.model;

import java.util.Comparator;

public class StudentCom  implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.getSid() - o2.getSid();
	}

}
