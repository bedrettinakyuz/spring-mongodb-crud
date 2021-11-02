package com.springCRUDEx.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springCRUDEx.Model.Book;

public interface BookRepository extends MongoRepository<Book,Integer>{

public List<Book> findByName(String name);

public List<Book> findByAuthor(String author);

}
