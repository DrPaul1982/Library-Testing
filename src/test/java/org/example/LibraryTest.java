package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void start() {
        library = new Library();
        library.getBooks().clear();
    }


    @Test
    void addBookTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        library.addBook(book);
        assertEquals(1, library.getBookCount());
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    void removeBookTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.getBookCount());
    }


    @Test
    void getBooksTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        Book book1 = new Book("Sos the Rope, 1968", "Pierce Anthony");
        library.addBook(book);
        library.addBook(book1);

        List<Book> books = library.getBooks();
        assertEquals(2, books.size());
        assertTrue(books.contains(book));
        assertTrue(books.contains(book1));
    }

    @Test
    void getBookCountTest() {
        assertEquals(0, library.getBookCount());

        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        Book book1 = new Book("Sos the Rope, 1968", "Pierce Anthony");
        library.addBook(book);
        library.addBook(book1);
        assertEquals(2, library.getBookCount());
    }

    @Test
    void bookListNullAfterRemoveAllBooksTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        Book book1 = new Book("Sos the Rope, 1968", "Pierce Anthony");
        library.addBook(book);
        library.addBook(book1);
        library.getBooks().clear();
        assertNotNull(library.getBooks());
    }

    @Test
    void bookListEmptyAfterRemoveAllBooksTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        Book book1 = new Book("Sos the Rope, 1968", "Pierce Anthony");
        library.addBook(book);
        library.addBook(book1);
        library.getBooks().clear();
        assertTrue(library.getBooks().isEmpty());
    }
}