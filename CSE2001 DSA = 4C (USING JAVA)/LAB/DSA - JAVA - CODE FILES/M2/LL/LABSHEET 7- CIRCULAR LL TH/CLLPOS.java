import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CLLPOS {
    private Node head;

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node cur = head;
            while (cur.next != head) {
                cur = cur.next;
            }
            cur.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node cur = head;
            while (cur.next != head) {
                cur = cur.next;
            }
            cur.next = newNode;
            newNode.next = head;
        }
    }

    public void insertAtPos(int data) {
        Node newNode = new Node(data);
        try (Scanner sc = new Scanner(System.in)) {
            if (head == null) {
                head = newNode;
                head.next = head;
            } else {
                System.out.print("Enter the position to insert: ");
                int pos = sc.nextInt();
                Node current = head;
                for (int i = 1; i < pos - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public void deleteAtFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node cur = head;
        if (cur.next == head) {
            head = null;
        } else {
            while (cur.next != head) {
                cur = cur.next;
            }
            cur.next = head.next;
            head = head.next;
        }
    }

    // Deletion at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node cur = head;
        Node prev = null;
        if (cur.next == head) {
            head = null;
            return;
        } else {
            while (cur.next != head) {
                prev = cur;
                cur = cur.next;
            }
            prev.next = head;
        }
    }

    public void deleteData(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node cur = head;
        Node prev = null;

        if (cur.next == head && cur.data == key) {
            head = null;
            return;
        }

        while (cur.data != key && cur.next != head) {
            prev = cur;
            cur = cur.next;
        }

        if (cur.data != key) {
            System.out.println("Given node is not found");
            return;
        }

        if (cur == head) {
            prev = head;
            while (prev.next != head)
                prev = prev.next;
            head = cur.next;
            prev.next = head;
        } else if (cur.next == head) {
            prev.next = head;
        } else {
            prev.next = cur.next;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);

        System.out.println("head");
    }

    public static void main(String[] args) {
        CLLPOS list = new CLLPOS();
        try (Scanner sc = new Scanner(System.in)) {
            int op, item;
            System.out.println("Implementation of Circular Linked List");
            while (true) {
                System.out.print("1. Insertion at the beginning\n2. Insertion at the end\n3. Insertion at a given Position (data)\n4. Deletion at the beginning\n5. Deletion at the end\n6. Deletion of a given node (data)\n7. Display list\n8. Exit\n");
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
                        System.out.print("Enter the value to insert: ");
                        item = sc.nextInt();
                        list.insertAtPos(item);
                        list.display();
                        break;
                    case 4:
                        list.deleteAtFront();
                        list.display();
                        break;
                    case 5:
                        list.deleteAtEnd();
                        list.display();
                        break;
                    case 6:
                        System.out.print("Enter data you want to do deletion: ");
                        item = sc.nextInt();
                        list.deleteData(item);
                        list.display();
                        break;
                    case 7:
                        list.display();
                        break;
                    case 8:
                        System.exit(1);
                }
            }
        }
    }
}
