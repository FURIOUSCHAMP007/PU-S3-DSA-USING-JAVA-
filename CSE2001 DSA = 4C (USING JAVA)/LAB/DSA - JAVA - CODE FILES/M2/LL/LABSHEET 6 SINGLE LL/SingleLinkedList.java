// LABSHEET 6 - SLL
//Demonstrate the linked list operation such as deleting a node, inserting the node at particular position, searching for a key element using Java Programming
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    private Node head;

    public void insertAtPos(int data) {
        Node newNode = new Node(data);
        try (Scanner sc = new Scanner(System.in)) {
            Node prev = null;
            Node current = head;
            int i = 1;
            System.out.println("Enter the position to be inserted:");
            int pos = sc.nextInt();
            for (i = 1; i < pos; i++) {
                prev = current;
                current = current.next;
            }
            newNode.next = current;
            if (prev != null) {
                prev.next = newNode;
            } else {
                head = newNode;
            }
        }
    }

    public void deleteAtFront() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node cur = head;
        head = head.next;
        System.out.println("Data deleted is: " + cur.data);
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node cur = head;
        if (cur.next == null) {
            head = null;
            System.out.println("Data deleted is: " + cur.data);
            return;
        }
        Node prev = null;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        System.out.println("Data deleted is: " + cur.data);
    }

    public void deleteAfterData(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node cur = head;
        while (cur != null && cur.data != data) {
            cur = cur.next;
        }
        if (cur == null) {
            System.out.println("Node is not present in the list.");
        } else if (cur.next != null) {
            Node deletedNode = cur.next;
            cur.next = cur.next.next;
            System.out.println("Data deleted is: " + deletedNode.data);
        } else {
            System.out.println("Deletion not possible; this is the last node.");
        }
    }

    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true; // Key found in the list
            }
            temp = temp.next;
        }
        return false; // Key not found in the list
    }

    public void display() {
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList  ();
        try (Scanner sc = new Scanner(System.in)) {
            int op, item;
            System.out.println("Implementation of Singly Linked List");
            while (true) {
                System.out.print("1.Insertion after a given node (data)\n2.Deletion at the beginning\n3.Deletion at the end\n4.Deletion after a given node (data)\n5.Display list\n6.Search for a key\n7.Exit\n");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.print("Enter the value to insert: ");
                        item = sc.nextInt();
                        list.insertAtPos(item);
                        list.display();
                        break;
                    case 2:
                        list.deleteAtFront();
                        list.display();
                        break;
                    case 3:
                        list.deleteAtEnd();
                        list.display();
                        break;
                    case 4:
                        System.out.print("Enter data after which you want to do deletion: ");
                        item = sc.nextInt();
                        list.deleteAfterData(item);
                        list.display();
                        break;
                    case 5:
                        list.display();
                        break;
                    case 6:
                        System.out.println("Enter the key to be searched");
                        int keyToSearch = sc.nextInt();
                        if (list.search(keyToSearch)) {
                            System.out.println("Key " + keyToSearch + " found in the linked list.");
                        } else {
                            System.out.println("Key " + keyToSearch + " not found in the linked list.");
                        }
                        break;
                    case 7:
                    System.exit(0);
                }
            }
        }
    }
}