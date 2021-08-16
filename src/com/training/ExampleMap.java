package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.training.model.Book;

public class ExampleMap {
	
	public static Map<Integer , Book> createMap(Book ... books){
		Map<Integer , Book> bookList = new HashMap<>();
		for(Book eachBook : books) {
			bookList.put(eachBook.getBookNumber(), eachBook);
		}
		return bookList;
	}
	
	public static void printUsingGet(int key , Map<Integer,Book> list)
	{
		System.out.println(list.get(key).getBookName());
	}
	
	public static void printUsingKeys(Map<Integer,Book> list)
	{
		Set<Integer> keys = list.keySet();
		for(Integer eachKey : keys) {
			System.out.println(eachKey);
		}
	}
	
	public static void printUsingValues(Map<Integer,Book> list)
	{
		Collection<Book> values = list.values();
		for(Book eachKey : values) {
			System.out.println(eachKey.getBookName());
		}
		
	}
	
	public static void printByGettingSetView(Map<Integer,Book> list) {
		Set<Map.Entry<Integer, Book>> setView = list.entrySet();
		Iterator<Map.Entry<Integer,Book>> itr = setView.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java = new Book(101,"Learn Java" , "Kathy sieera" , 450);
		Book spring = new Book(102,"Spring in action" , "Ben Johnson" , 950);
		Book thomas = new Book(103,"Effective Spring" , "Thomas" , 1450);
		Map<Integer,Book> list = createMap(java,spring,thomas);
		//printUsingGet(101,list);
		printByGettingSetView(list);
	}

}
