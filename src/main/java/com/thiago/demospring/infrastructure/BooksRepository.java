package com.thiago.demospring.infrastructure;

import com.thiago.demospring.domain.entities.Book;
import com.thiago.demospring.domain.interfaces.BooksRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public class BooksRepository implements BooksRepositoryInterface {
    private static BooksRepository instance;
    private static List<Book> books;

    private BooksRepository() {
        books = new ArrayList<>();
    }

    public static synchronized BooksRepository getInstance() {
        if (instance == null) {
            instance = new BooksRepository();
            instance.setBooks(new ArrayList<>());
        }
        return instance;
    }

    public Iterable<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        BooksRepository.books = books;
    }

    public void editBook(Book book) {
        books.stream().filter(b -> b.getIsbn().equals(book.getIsbn())).forEach(b -> {
            b.setTitle(book.getTitle());
            b.setAuthor(book.getAuthor());
        });
    }

    public void deleteBook(String isbn) {
        BooksRepository.books.removeIf(b -> b.getIsbn().equals(isbn));
    }
}