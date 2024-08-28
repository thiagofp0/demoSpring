package com.thiago.demospring.domain.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String title;
    private String isbn;
    private Author author;

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }
}