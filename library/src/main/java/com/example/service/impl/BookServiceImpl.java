package com.example.service.impl;

import com.example.business.Book;
import com.example.config.HibernateConfig;
import com.example.service.BookInterface;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookInterface {
  private List<Book> books = new ArrayList<>();

  @Override
  public void addBook(Book book) {
    Transaction transaction = null;
    try (Session session = HibernateConfig.getSessionFactory().openSession()) {
      transaction = session.beginTransaction();
      session.persist(book);
      transaction.commit();
      books.add(book);
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }
      e.printStackTrace();
    }
  }

  @Override
  public List<Book> getBooks() {
    return books;
  }
}