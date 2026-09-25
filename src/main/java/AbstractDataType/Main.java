/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
package AbstractDataTypes;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());   // 30
        System.out.println("Size: " + stack.size());          // 3

        System.out.println("Popped: " + stack.pop());         // 30
        System.out.println("Size after pop: " + stack.size());// 2
        System.out.println("Is empty? " + stack.isEmpty());   // false
    }

}
