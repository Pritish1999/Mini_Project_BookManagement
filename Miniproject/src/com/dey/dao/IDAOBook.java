package com.dey.dao;

import java.util.List;
import java.util.TreeSet;

import com.dey.model.Book;

public interface IDAOBook {
	public TreeSet<Book> displayAll();
	public void insertBook(Book b);
    public void deleteBook(int id);
    public void exit();
    public void findById(int id);
    public void updateBook(int id, int price);

}
