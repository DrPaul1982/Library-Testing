package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
Library library;

    @BeforeEach
    void start() {
        library = new Library();
        library.getBooks().clear();
    }

    @Test
    void getTitle() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        assertEquals("Roadside Picnic, 1972", book.getTitle());
    }

    @Test
    void setTitleTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        book.setTitle("Sos the Rope, 1968");
        assertEquals("Sos the Rope, 1968", book.getTitle());
    }

    @Test
    void getAuthorTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        assertEquals("Arkady and Boris Strugatsky", book.getAuthor());
    }

    @Test
    void setAuthorTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        book.setAuthor("Pierce Anthony");
        assertEquals("Pierce Anthony", book.getAuthor());
    }

    @Test
    void testEqualsTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        Book book1 = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        assertTrue(book.equals(book1));
    }

    @Test
    void testHashCodeTest() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        Book book1 = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        assertEquals(book.hashCode(), book1.hashCode());
    }

    @Test
    void testToString() {
        Book book = new Book("Roadside Picnic, 1972", "Arkady and Boris Strugatsky");
        assertEquals("Book {title = 'Roadside Picnic, 1972', author = 'Arkady and Boris Strugatsky'}", book.toString());
    }
}