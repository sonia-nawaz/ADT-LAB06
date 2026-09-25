/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
package AbstractDataTypes;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student(1, "Sonia", 3.9);

        // Correct way — via getters
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());

        // Uncomment the line below to PROVE encapsulation works:
        // s.id = 5;   // ❌ Compile-time error: id has private access in Student
    }
}