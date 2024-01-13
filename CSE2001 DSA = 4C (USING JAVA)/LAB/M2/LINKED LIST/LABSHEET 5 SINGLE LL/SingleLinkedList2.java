//Demonstrate the construction of single linked list by inserting the nodes from front and rear using Java Programming
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList2 {
    private Node head;

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " inserted at the front.");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println(data + " inserted at the end.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        System.out.println(data + " inserted at the end.");
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkedList2 list = new SingleLinkedList2();
        try (Scanner sc = new Scanner(System.in)) {
            int op, item;
            System.out.println("Implementation of Singly Linked List");
            while (true) {
                System.out.println("1. Insertion at the beginning");
                System.out.println("2. Insertion at the end");
                System.out.println("3. Display list");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.print("Enter value: ");
                        item = sc.nextInt();
                        list.insertAtFront(item);
                        list.display();
                        break;
                    case 2:
                        System.out.print("Enter value: ");
                        item = sc.nextInt();
                        list.insertAtEnd(item);
                        list.display();
                        break;
                    case 3:
                        list.display();
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }
    }
}
