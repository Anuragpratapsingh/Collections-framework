package com.training.ifacesImpl;

import java.util.List;

import com.training.ifaces.Repository;

import com.training.model.*;
import com.training.utils.MyFactory;

import java.util.*;

public class StudentRepoImpl implements Repository<Student> {
	
	public List<Student> studList;
	
	public StudentRepoImpl() {
		super();
		// TODO Auto-generated constructor stub
		studList = new ArrayList<>();
	}

	@Override
	public boolean add(Student t) {
		// TODO Auto-generated method stub
		return studList.add(t);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studList;
	}

	@Override
	public boolean remove(Student t) {
		// TODO Auto-generated method stub
		return studList.remove(t);
	}

	@Override
	public List<Student> sortedList() {
		// TODO Auto-generated method stub
		Collections.sort(this.studList);
		return studList;
	}

	@Override
	public List<Student> sortBy(String prop) {
		// TODO Auto-generated method stub
		MyFactory fac = new MyFactory();
		Comparator comp = fac.getComparator(prop);
		Collections.sort(studList,comp);
		
		return studList;
	}

}
