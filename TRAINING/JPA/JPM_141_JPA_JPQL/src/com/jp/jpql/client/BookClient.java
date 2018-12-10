package com.jp.jpql.client;

import com.jp.jpql.entity.Book;
import com.jp.jpql.services.BookServiceImpl;
import com.jp.jpql.services.IBookService;

public class BookClient {

	
	public static void main (String [] args) {
		IBookService service = new BookServiceImpl();
		System.out.println("**************************Listing book with id*********************************** ");
		System.out.println("Book with ID 101 : " + service.getBookById(102));
		
		
		System.out.println("**************************Listing All Books*********************************** ");
		for (Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		System.out.println("**************************Listing book by Title*********************************** ");
		for (Book book:service.getBookByTitle("Java")) {
			System.out.println(book);
		}
		
		System.out.println("**************************Listing Count of book*********************************** ");
		System.out.println("Book Count : " + service.getBookCount());
		
		System.out.println("**************************Listing book by Danny Coward*********************************** ");
		for (Book book:service.getAuthorBooks("Danny Coward")) {
			System.out.println(book);
		}
		
		
		System.out.println("**************************Listing All Books between 500 and 600*********************************** ");
		for (Book book:service.getBooksInPriceRange(500, 600)){
			System.out.println(book);
		}
	}
}