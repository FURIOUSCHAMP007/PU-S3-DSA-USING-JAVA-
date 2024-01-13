//LABSHEET 9- DLL - INSERT AT FRONT | INSERT AT END | DISPLAY 

package DLL;

import java.util.Scanner;

class Node {
    int data;
    Node lLink;
    Node rLink;

    public Node(int data) {
        this.data = data;
        this.lLink = null;
        this.rLink = null;
    }
}

public class DLL {
    private Node head;

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.rLink = head;
            head.lLink = newNode;
            head = newNode;
        }
        System.out.println(data + " inserted at the front.");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.rLink != null) {
                current = current.rLink;
            }
            current.rLink = newNode;
            newNode.lLink = current;
        }
        System.out.println(data + " inserted at the end.");
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.rLink;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        try (Scanner scanner = new Scanner(System.in)) {
            int option, item;
            System.out.println("Implementation of DLL");
            while (true) {
                System.out.println("1. Insertion at the beginning");
                System.out.println("2. Insertion at the end");
                System.out.println("3. Display list");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Enter value: ");
                        item = scanner.nextInt();
                        list.insertAtFront(item);
                        list.display();
                        break;
                    case 2:
                        System.out.print("Enter value: ");
                        item = scanner.nextInt();
                        list.insertAtEnd(item);
                        list.display();
                        break;
                    case 3:
                        list.display();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
