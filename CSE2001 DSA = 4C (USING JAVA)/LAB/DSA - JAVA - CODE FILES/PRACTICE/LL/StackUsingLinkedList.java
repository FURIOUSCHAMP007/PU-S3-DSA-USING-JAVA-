package LL;
//IMPLEMENTATION OF STACK USING SINGLE LINKED LIST 

//INSERT AT END 
//DELETE AT END 
//DISPLAY 

//JAVA DYNAMIC CODE 

//Here's a Java implementation of a stack using a single linked list with the following operations: Insert at End, Delete at End, and Display.


import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    // Insert at End (Push)
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed onto the stack.");
    }

    // Delete at End (Pop)
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty. Nothing to pop.");
        } else {
            System.out.println("Popped value: " + top.data);
            top = top.next;
        }
    }

    // Display the stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents:");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Stack Operations:");
                System.out.println("1. Push (Insert at End)");
                System.out.println("2. Pop (Delete at End)");
                System.out.println("3. Display");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the value to push: ");
                        int value = sc.nextInt();
                        stack.push(value);
                        break;
                    case 2:
                        stack.pop();
                        break;
                    case 3:
                        stack.display();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
