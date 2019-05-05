package com.hand.core.menu.controllers;

import com.hand.core.menu.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @Autowired
    Book book;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){

        return "hello world"+book.getName()+","+book.getPrice()+","+book.getDesc();
    }

}
