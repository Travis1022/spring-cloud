package com.dsx.provider.service.impl;

import com.dsx.provider.domain.Book;
import com.dsx.provider.mapper.BookMapper;
import com.dsx.provider.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookService implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getBookById(Integer bookId) {
        return bookMapper.getBookById(bookId);
    }
}
