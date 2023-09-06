/**
 * stack
 */
public class stack {
    private int maxval;
    private int top;
    private int sArray[];

    public stack() {
        maxval = 5;
        top = -1;
        sArray = new int[maxval];
    }

    public void push(int value) {
        if (top < maxval - 1) {
            top += 1;
            sArray[top] = value;
        } else {
            System.out.println("the stack is full");
        }

    }

    public int pop() {
        if (top >= 0) {
            int deletedval = sArray[top];
            top -= 1;
            return deletedval;

        } else {
            System.out.println("empty stack");
            return -1;
        }
    }

    public void display() {
        for (int i = 0; i < maxval; ++i) {
            System.out.println(sArray[i]);
        }
    }

    public void peek() {
        if (top > -1) {
            System.out.println();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        stack s1=new stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.display();
        System.out.println(" ");
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println(" ");
        s1.display();
        s1.push(70);
        System.out.println();
        s1.display();
      

        
        
    }
}