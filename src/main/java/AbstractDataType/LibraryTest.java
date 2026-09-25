/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */package AbstractDataTypes;

public class LibraryTest {
    public static void main(String[] args) {
        LibrarySystem library = new LibraryImplementation();

        library.addBook("B001", "Clean Code", "Robert C. Martin");
        library.addBook("B002", "Effective Java", "Joshua Bloch");

        System.out.println(library.searchBook("B001"));

        System.out.println("Issuing B001: " + library.issueBook("B001"));
        System.out.println(library.searchBook("B001"));

        System.out.println("Returning B001: " + library.returnBook("B001"));
        System.out.println(library.searchBook("B001"));

        library.removeBook("B002");
        System.out.println(library.searchBook("B002"));
    }
}
