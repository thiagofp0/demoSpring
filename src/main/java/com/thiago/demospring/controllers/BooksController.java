package com.thiago.demospring.controllers;

import com.thiago.demospring.domain.entities.Book;
import com.thiago.demospring.infrastructure.BooksRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    @GetMapping("/get")
    public ResponseEntity<Iterable<Book>> getBooks() {
        Iterable<Book> books = BooksRepository.getInstance().getBooks();
        return ResponseEntity.ok(books);
    }

    @PostMapping("/set")
    public ResponseEntity<Void> setBooks(@RequestBody List<Book> books) {
        BooksRepository.getInstance().setBooks(books);
        return ResponseEntity.ok().build();
        // return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public ResponseEntity<Void>  putBooks(@RequestBody Book book) {
        BooksRepository.getInstance().editBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{isbn}")
    public ResponseEntity<Void> deleteBooks(@PathVariable String isbn) {
        System.out.println(isbn);
        BooksRepository.getInstance().deleteBook(isbn);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}