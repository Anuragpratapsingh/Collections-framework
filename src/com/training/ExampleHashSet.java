package com.training;
import java.util.*;

import com.training.comparators.AuthorNameComparator;
import com.training.model.Book;


public class ExampleHashSet {
	
	public static void print(Set<Book> books) {
		for(Book eachBook : books) {
			System.out.println(eachBook.getBookName());
			System.out.println(eachBook.getAuthor());
		}
	}
	
	public static Set<Book> usingTreeSet(Book ...books){
		Set<Book> myTreeSet = new TreeSet<>(new AuthorNameComparator());
		for(Book eachBook : books) {
			myTreeSet.add(eachBook);
		}
		return myTreeSet;
	}
	
	public static Set<Book> usingHashSet(Book ...books)
	{
		Set<Book> bookList = new HashSet<>();
		for(Book eachBook : books) {
			bookList.add(eachBook);
		}
		return bookList;
	}
	
	public static void main(String[] args) {
		Book java = new Book(101,"Learn Java" , "Kathy sieera" , 450);
		Book spring = new Book(102,"Spring in action" , "Ben Johnson" , 950);
		Book thomas = new Book(103,"Effective Spring" , "Thomas" , 1450);
		Book thomas2 = new Book(103,"Effective Spring" , "Thomas" , 1450);
		Set<Book> response = usingTreeSet(java,spring,thomas,thomas2);
		print(response);
	}
}
