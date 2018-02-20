package com.vova.books.repository;

import com.vova.books.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, Long> {

    @Query("{'name' : { $regex: ?0, $options: 'i'}}")
    List<Book> findBooksByName(String name);
}
