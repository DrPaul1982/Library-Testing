package org.example;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        if (title == null || title.isEmpty()){
            throw new IllegalArgumentException("Book title cannot be empty");
        }
        if (author == null || author.isEmpty()){
            throw new IllegalArgumentException("Book author cannot be empty");
        }
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()){
            throw new IllegalArgumentException("Book title cannot be empty");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()){
            throw new IllegalArgumentException("Book author cannot be empty");
        }
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book {" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                '}';
    }
}
