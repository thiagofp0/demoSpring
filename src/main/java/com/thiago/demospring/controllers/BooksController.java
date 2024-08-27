package com.thiago.demospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    @GetMapping("/get")
    public String getBooks() {
        return("Get books");
    }

    @GetMapping("/set")
    public String setBooks() {
        return("Set books");
    }

    @PostMapping("/post")
    public String postBooks(@RequestBody String book) {
        return(book);
    }

    @PutMapping("/put")
    public String putBooks(@RequestBody String book) {
        return(book);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBooks(@PathVariable String id) {
        return("Delete book with id: " + id);
    }
}