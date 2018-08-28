package com.dsx.provider.controller;

import com.dsx.provider.domain.Book;
import com.dsx.provider.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {


    @Autowired
    BookService bookService;

    @GetMapping("id/{bookId}")
    public Book getBook(@PathVariable("bookId") Integer bookId){
        return  bookService.getBookById(bookId);
    }
}
