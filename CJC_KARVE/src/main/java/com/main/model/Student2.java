package com.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student2 {
	
	@Id
	private int sid;
	private String sname;
	private String course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	

}
