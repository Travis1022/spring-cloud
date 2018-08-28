package com.dsx.provider.service;


import com.dsx.provider.domain.Book;

/**
 * Book 业务接口类
 */
public interface IBookService {

    Book getBookById(Integer bookId);
}
