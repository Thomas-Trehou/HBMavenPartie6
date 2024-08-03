package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import com.example.business.Book;

public class BookTest {

  @Test
  public void testGetAge() {
    // Arrange
    Book book = new Book();
    book.setPublishedYear(2000);

    // Act
    int age = book.getAge();

    // Assert
    int currentYear = java.time.LocalDateTime.now().getYear();
    assertEquals(currentYear - 2000, age);
  }
}
