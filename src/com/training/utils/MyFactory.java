package com.training.utils;

import java.util.Comparator;

import com.training.comparators.MarksComparator;
import com.training.comparators.StudentNameComparator;
import com.training.ifaces.Repository;
import com.training.ifacesImpl.StudentRepoImpl;

public class MyFactory {
	public Repository getRepo(String key) {
		
		switch (key.toLowerCase()) {
		case "list": {
			
			return new StudentRepoImpl();
		}
		default:
			return null;
		}
		
	}
	
	public Comparator getComparator(String key) {
		switch (key) {
		case "studentMarks": 
			return new MarksComparator();
		case "studentName": 
			return new StudentNameComparator(); 
		default:
			return null;
		}	
	}

}
