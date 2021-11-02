package com.springCRUDEx.DAL;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springCRUDEx.Model.Book;
import com.springCRUDEx.Repositories.BookRepository;

@Service
public class BookDal {

 @Autowired
 private BookRepository bookRepository;
 
 @Transactional
  public String addBook(Book book)
  {
	 try {
		  bookRepository.save(book);
		  return "Book Added with id : " + book.getId();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
		 return "hata";
	 }

  }
  
	@Transactional
	public List<Book> getAll() {
		
		
		return ((List<Book>)this.bookRepository.findAll());
	}
	
	@Transactional
	public List<Book> getByBookName(String book) {
		
		
		return ((List<Book>)this.bookRepository.findByName(book));
	}
	
  
}
