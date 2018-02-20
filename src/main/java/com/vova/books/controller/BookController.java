package com.vova.books.controller;

import com.vova.books.entity.Book;
import com.vova.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    List<Book> getAllBooks(@RequestParam String name) {
        return bookService.getBookWithName(name);
    }

    @PostMapping(value = "/books")
    @ResponseStatus(HttpStatus.CREATED)
    Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

}
