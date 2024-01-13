package LL;
//IMPLEMENTATION OF QUEUE USING SINGLE LINKED LIST 

//INSERT AT END 
//DELETE AT FRONT
//DISPLAY 

//JAVA DYNAMIC CODE 

//Here's a Java implementation of a queue using a single linked list with the following operations: Insert at End (enqueue), Delete at Front (dequeue), and Display.

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;

    // Insert at End (enqueue)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued into the queue.");
    }

    // Delete at Front (dequeue)
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Nothing to dequeue.");
        } else {
            System.out.println("Dequeued value: " + front.data);
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
    }

    // Display the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue contents:");
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Queue Operations:");
                System.out.println("1. Enqueue (Insert at End)");
                System.out.println("2. Dequeue (Delete at Front)");
                System.out.println("3. Display");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the value to enqueue: ");
                        int value = sc.nextInt();
                        queue.enqueue(value);
                        break;
                    case 2:
                        queue.dequeue();
                        break;
                    case 3:
                        queue.display();
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
