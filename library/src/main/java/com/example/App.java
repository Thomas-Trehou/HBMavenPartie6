package com.example;

import com.example.business.Book;
import com.example.service.impl.BookServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Book book = new Book("Le Seigneur des Anneaux", "J.R.R. Tolkien", 1954);

        Book book2 = new Book("Harry Potter", "J.K. Rowling", 1997);

        BookServiceImpl bookService = new BookServiceImpl();
        bookService.addBook(book);
        bookService.addBook(book2);

        System.out.println("Books: " + bookService.getBooks());

    }
}
