package com.thiago.demospring.domain.interfaces;

import com.thiago.demospring.domain.entities.Book;

import java.util.List;

public interface BooksRepositoryInterface {
    Iterable<Book> getBooks();
    void setBooks(List<Book> books);
    void editBook(Book book);
    void deleteBook(String isbn);
}
