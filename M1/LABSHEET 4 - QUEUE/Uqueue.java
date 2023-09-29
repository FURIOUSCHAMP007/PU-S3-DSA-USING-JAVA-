public class Uqueue {
 private int maxSize;
 private int front;
 private int rear;
 private int[] queueArray;
 
public Uqueue() {
 maxSize = 5; // One extra space to differentiate between front and rear positions
 queueArray = new int[maxSize];
 front = 0;
 rear = -1;
 }
 
 public void enqueue(int value) {
 if (rear==maxSize-1) {
 System.out.println("Queue is full. Cannot enqueue " + value);
 return;
 }
 else { 
 rear = (rear + 1);
 queueArray[rear] = value;
 System.out.println(value + " enqueued.");
 } 
 
 }
 
 public int dequeue() {
 if (front>rear) {
 System.out.println("Queue is empty. Cannot dequeue.");
 return -1;
 }
 else {
 int dequeuedValue = queueArray[front];
 front = (front + 1);
 System.out.println(dequeuedValue + " dequeued.");
 return dequeuedValue;
 } 
 // Or throw an exception
 }
 
 
 public int peek() {
 if (front>rear) {
     System.out.println("Queue is empty. Nothing to peek.");
return -1; 
 } else {
 return queueArray[front];
 // Or throw an exception
 }
 }
 
 public void display() {
 int i;
 if(isEmpty()) {
 System.out.println("Empty Queue");
 }
 else {
 System.out.println("Items in queue");
 for(i=front;i<=rear;i++) {
 System.out.println(queueArray[i]);
 }
 }
 }
 
 public boolean isEmpty() {
 return (rear + 1)== front;
 }
 
 public boolean isFull() {
 return rear== maxSize-1;
 }
 
 public static void main(String[] args) {
 Uqueue q = new Uqueue();
 
 q.enqueue(10);
 q.enqueue(20);
 q.enqueue(30);
 q.display();
 
 System.out.println("Peek: " + q.peek());
 
 q.dequeue();
 q.dequeue();
 q.dequeue();
 q.enqueue(40);
 q.display(); 
 
 System.out.println("Is empty? " + q.isEmpty());
 System.out.println("Is full? " + q.isFull());
}
}