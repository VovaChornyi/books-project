package com.vova.books.service;

import com.vova.books.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    Book addBook(Book book);

    List<Book> getBookWithName(String name);


}
