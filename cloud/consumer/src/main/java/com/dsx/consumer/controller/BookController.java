package com.dsx.consumer.controller;


import com.dsx.consumer.viewobject.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * BookController
 * create by dsx on 2018-08-28
 */
@RestController
@RequestMapping("client")
public class BookController {


    @Autowired
    RestTemplate restTemplate;


    @GetMapping("bookId/{bookID}")
    BookVo getBookById(@PathVariable("bookID") Integer bookId) {
        return restTemplate.getForObject("http://127.0.0.1:8090/book/id/1001", BookVo.class);
    }

}
