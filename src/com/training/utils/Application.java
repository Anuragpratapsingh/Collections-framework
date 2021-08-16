package com.training.utils;

import java.util.Collections;
import java.util.List;

import com.training.ifaces.Repository;
import com.training.ifacesImpl.StudentRepoImpl;
import com.training.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRepoImpl impl = new StudentRepoImpl();
		MyFactory factory = new MyFactory();
		//Student stud = new Student(Integer.parseInt(args[0]),args[1],Double.parseDouble(args[2]));
		Student s1 = new Student(1 , "Anurag" , 2.0);
		Student s2 = new Student (10 , "Salman" , 1.0);
		Student s3 = new Student(15 , "Kabul" , 4.0);
		
		Repository repo = factory.getRepo("list");
		repo.add(s1);
		repo.add(s2);
		repo.add(s3);
		//System.out.println("is Added := " + repo.add(stud));
		List<Student> list = repo.findAll();
		Collections.sort(list , factory.getComparator("studentMarks"));

		for(Student eachStudent : list) {
			System.out.println(eachStudent);
		}
	}

}
