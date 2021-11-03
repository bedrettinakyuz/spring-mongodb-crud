package com.springCRUDEx.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	 @Autowired
	private BookDal bookDal ;
	
	@PostMapping("/add")
	public String addBook(@RequestBody Book book)
	{
		try {
			return bookDal.addBook(book);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	@GetMapping("/get")
	public List<Book> getBooks(){
		
		return bookDal.getAll();
	}
	
}
