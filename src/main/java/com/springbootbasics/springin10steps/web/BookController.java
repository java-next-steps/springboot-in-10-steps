package com.springbootbasics.springin10steps.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping(value = "/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(1,"Power to lead", "Manas"),
                new Book(2, "Experiments with Truth", "Gandhi"));
    }
}
