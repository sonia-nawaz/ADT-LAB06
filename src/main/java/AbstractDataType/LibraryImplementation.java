/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
package AbstractDataTypes;

import java.util.HashMap;

public class LibraryImplementation implements LibrarySystem {
    private HashMap<String, Book> books;

    public LibraryImplementation() {
        books = new HashMap<>();
    }

    @Override
    public void addBook(String bookId, String title, String author) {
        books.put(bookId, new Book(bookId, title, author));
    }

    @Override
    public void removeBook(String bookId) {
        books.remove(bookId);
    }

    @Override
    public String searchBook(String bookId) {
        Book b = books.get(bookId);
        return (b != null) ? b.toString() : "Book not found";
    }

    @Override
    public boolean issueBook(String bookId) {
        Book b = books.get(bookId);
        if (b != null && !b.isIssued()) {
            b.setIssued(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook(String bookId) {
        Book b = books.get(bookId);
        if (b != null && b.isIssued()) {
            b.setIssued(false);
            return true;
        }
        return false;
    }
}