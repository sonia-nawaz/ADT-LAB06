/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
package AbstractDataTypes;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class AbstractionTest {
    public static void main(String[] args) {
        // Declared using the interface type
        List<String> students;

        // Instantiated as ArrayList
        students = new ArrayList<>();
        students.add("Ali");
        System.out.println("Using ArrayList: " + students);

        // Same variable reassigned as LinkedList — no other code changes
        students = new LinkedList<>();
        students.add("Sara");
        System.out.println("Using LinkedList: " + students);
    }
}