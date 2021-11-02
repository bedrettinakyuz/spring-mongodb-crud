package com.springCRUDEx.Api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springCRUDEx.DAL.BookDal;
import com.springCRUDEx.Model.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	private BookDal bookDal ;
	
	@PostMapping("/add")
	public String addBook(@RequestBody Book book)
	{
		return bookDal.addBook(book);
		
	}
	
	@GetMapping("/get")
	public List<Book> getBooks(){
		
		return bookDal.getAll();
	}
	
}
