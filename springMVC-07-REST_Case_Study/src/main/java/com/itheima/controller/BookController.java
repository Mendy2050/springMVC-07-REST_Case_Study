package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-28 20:21
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save ==>" +book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setType("computer");
        book1.setName("springMVC introduction");
        book1.setDescription("first try");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setType("computer");
        book2.setName("springMVC study case");
        book2.setDescription("this is the master");
        bookList.add(book2);

        Book book3 = new Book();
        book3.setType("computer");
        book3.setName("springMVC study case - advanced");
        book3.setDescription("this is the master's masterpiece");
        bookList.add(book3);

        return bookList;
    }

}

