/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
package AbstractDataTypes;

// Implementing Stack Using Array
public class ArrayStack<T> implements Stack<T> {
    private Object[] elements;
    private int top;

    public ArrayStack(int capacity) {
        elements = new Object[capacity];
        top = 0;
    }

    @Override
    public void push(T item) {
        if (top == elements.length) {
            throw new RuntimeException("Stack overflow");
        }
        elements[top] = item;
        top++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        top--;
        return (T) elements[top];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) elements[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }
}