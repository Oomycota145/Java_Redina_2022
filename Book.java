package org.example;

import java.util.ArrayList;

public class Book {
  private int id;
  private String name;
  private String author;
  private String publishing;
  private int yearPublishing;
  private int countPages;
  private int price;
  private String typeBinding;
  private String type;

  public Book() {}

  public Book(
      int id,
      String name,
      String author,
      String publishing,
      int yearPublishing,
      int countPages,
      int price,
      String typeBinding) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.publishing = publishing;
    this.yearPublishing = yearPublishing;
    this.countPages = countPages;
    this.price = price;
    this.typeBinding = typeBinding;
  }

  public Book(
      int id,
      String name,
      String author,
      String publishing,
      int yearPublishing,
      int countPages,
      int price,
      String typeBinding,
      String type) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.publishing = publishing;
    this.yearPublishing = yearPublishing;
    this.countPages = countPages;
    this.price = price;
    this.typeBinding = typeBinding;
    this.type = type;
  }

  public static ArrayList<Book> getByAuthor(ArrayList<Book> books, String currentAuthor) {
    for (int i = 0; i < books.size(); i++) {
      if (!books.get(i).author.equals(currentAuthor)) books.remove(i);
    }
    return books;
  }

  public static ArrayList<Book> getByPublisher(ArrayList<Book> books, String currentPublishing) {
    for (int i = 0; i < books.size(); i++) {
      if (!books.get(i).publishing.equals(currentPublishing)) books.remove(i);
    }
    return books;
  }

  public static ArrayList<Book> getAfterYear(ArrayList<Book> books, int currentYear) {
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).yearPublishing <= currentYear) books.remove(i);
    }
    return books;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Book with "
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", author='"
        + author
        + '\''
        + ", publishing='"
        + publishing
        + '\''
        + ", yearPublishing="
        + yearPublishing
        + ", countPages="
        + countPages
        + ", price="
        + price
        + ", typeBinding="
        + typeBinding
        + ", type='"
        + type;
  }
}
