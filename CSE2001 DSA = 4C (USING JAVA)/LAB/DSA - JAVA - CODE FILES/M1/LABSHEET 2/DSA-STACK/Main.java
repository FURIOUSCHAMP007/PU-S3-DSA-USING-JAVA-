// Stack class
class Stack {
    int top; // define top of stack
    int maxsize = 5; // max size of the stack
     int[] stack_arry = new int[maxsize]; // define array that will hold stack elements

    Stack() { // stack constructor; initially top = -1
        top = -1;
    }

    boolean isEmpty() { // isEmpty() method
        return (top < 0);
    }

    boolean push(int val) { // push() method
        if (top == maxsize - 1) {
            System.out.println("Stack Overflow !!");
            return false;
        } else {
            top++;
            stack_arry[top] = val;
            return true;
        }
    }

    boolean pop() { // pop() method
        if (top == -1) {
            System.out.println("Stack Underflow !!");
            return false;
        } else {
            System.out.println("\nItem popped: " + stack_arry[top--]);
            return true;
        }
    }

    void display() { // print the stack elements
        System.out.println("Printing stack elements .....");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack_arry[i] + " ");
        }
        System.out.println();
    }

    public void insertAtEnd(int item) {
    }

    public void deleteAtEnd() {
    }static void main(String[] args) {
        // Define a stack object
        Stack stck = new Stack();
        System.out.println("Initial Stack Empty : " + stck.isEmpty());

        // Push elements
        stck.push(10);
        stck.push(20);
        stck.push(30);
        stck.push(40);

        System.out.println("After Push Operation...");
        // Print the elements
        stck.display();

        // Pop two elements from the stack
        stck.pop();
        stck.pop();

        System.out.println("After Pop Operation...");
        // Print the stack again
        stck.display();
    }
}
