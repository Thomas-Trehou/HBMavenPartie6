package com.example.service;

import com.example.business.Book;

import java.util.List;

public interface BookInterface {
  void addBook(Book book);

  List<Book> getBooks();

}
