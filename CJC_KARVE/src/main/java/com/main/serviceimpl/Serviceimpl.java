package com.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Repoi.HomeRepoi;
import com.main.model.Student2;
import com.main.servicei.Servicei;


@Service
public class Serviceimpl  implements Servicei{
	
	@Autowired
	HomeRepoi hr;

	@Override
	public void saveData(Student2 s) {
		hr.save(s);
		
	}
	
	

}
