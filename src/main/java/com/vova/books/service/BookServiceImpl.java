package com.vova.books.service;

import com.vova.books.entity.Book;
import com.vova.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBookWithName(String name) {
        return bookRepository.findBooksByName(name);
    }

}
