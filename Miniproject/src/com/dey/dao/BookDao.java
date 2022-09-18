package com.dey.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import com.dey.db.BookDb;
import com.dey.model.Book;
public class BookDao {

	//TreeSet<Book> obj;
/*	public BookDao( ) {
	this.obj=obj;
	}*/
	public BookDao()
	{
		super();
		
	}
/*	public BookDao() {
		super();
		// TODO Auto-generated constructor stub
	}*/

	public void displayAll() {
		//Book obj1=new Book();
	/*	Iterator<Book> itr=details.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		System.out.println(BookDb.details);
		//System.out.println(details);
		//BookDb obj=new BookDb();
		//obj.database();
		
	   
	}
	public void insertBook(Book b) {
		//BookDb obj=new BookDb();
		//TreeSet<Book> b1=details;
		BookDb.details.add(b);
		//b1.add(b);
		//System.out.println(details);
	}
	public void deleteBook(int id) {
		//BookDb obj=new BookDb();
     //  TreeSet<Book> tree;
		TreeSet<Book> b=BookDb.details;
		Iterator<Book> itr=b.iterator();
		//Iterator<Book> itr1=((Collection<Book>) obj).iterator();
		
		while(itr.hasNext()) {
			if((itr.next()).getId()==id)
			{
				//System.out.println(itr.next());
				itr.remove();
			}
			}
			//details.removeIf(n->.getId()==id);
			//for(Book i=0;i<details.size();i++) {
				//if(details[i].getId()==id)
			//y
			//}
		}
	
	public void exit() {
		System.exit(0);
	}
	public void findById(int id) {
		
		Iterator<Book> itr=BookDb.details.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			if((b).getId()==id)
			{
				System.out.println(b);
			}
			
		}
	}
	public void updateBook(int id,int price) {
		TreeSet<Book> b=BookDb.details;
		Iterator<Book> itr =b.iterator();
		while(itr.hasNext()) {
			Book b1=itr.next();
			if((b1).getId()==id)
			{
				
				b1.setPrice(price);
				BookDb.details.add(b1);
				//System.out.println(b);
				//System.out.println(details);
			}
		}
		//TreeSet<Book> b=new TreeSet<>(details);
		//List<Book> lst=new ArrayList<>(details);
		//ListIterator<Book> itr=lst.listIterator();
		//Iterator<Book> itr1=((Collection<Book>) obj).iterator();
		
	/*	while(itr.hasNext()) {
			//Book b1=itr.next();
			if(itr.next().getId()==id)
			{
				
				//System.out.println(itr.next());
				//itr.next();
			String title=itr.previous().getTitle();
			System.out.println(title);
			itr.next();
			String author=itr.previous().getAuthor();
			System.out.println(author);
			itr.next();
				//itr.remove();
				lst.removeIf(itr.previous()::equals);
				System.out.println(details);
				Book b3=new Book(id,title,author,price);
				lst.add(b3);
				//b1=itr.next();
			}*/
			


		}
	}


