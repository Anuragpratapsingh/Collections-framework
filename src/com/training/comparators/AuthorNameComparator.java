package com.training.comparators;

import java.util.Comparator;

import com.training.model.Book;

public class AuthorNameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
