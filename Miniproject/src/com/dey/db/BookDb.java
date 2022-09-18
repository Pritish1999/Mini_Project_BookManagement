package com.dey.db;
import java.util.*;
import com.dey.model.Book;
public class BookDb {
	//public static TreeSet<Book> details=new TreeSet<>();
	public static  TreeSet<Book> details;
	static{
	details=new TreeSet<>();
	details.add(new Book(1,"Harry Potter","JK Rowling",2000));
	details.add(new Book(2,"Twenty Miles","Pritish",3000));
	details.add(new Book(3,"simp:Happens to everyone","Mahesh",4000));
	details.add(new Book(4,"Life of Pi","Nitish",7000));
	//System.out.println(details);
	}
	/*public static TreeSet<Book> getCollection(){
		return details;
	}*/
	

}
