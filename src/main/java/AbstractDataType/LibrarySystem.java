/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
package AbstractDataTypes;

public interface LibrarySystem {
    void addBook(String bookId, String title, String author);
    void removeBook(String bookId);
    String searchBook(String bookId);
    boolean issueBook(String bookId);
    boolean returnBook(String bookId);
}