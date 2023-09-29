public class LocalVariables {
    int a; // Declared as an instance variable

    public void show() {
        a = 10; // Assign a value to the instance variable
        System.out.println("Inside show method, a = " + a);
    }

    public void display() {
        int b = 20;
        System.out.println("Inside display method, b = " + b);
        // Now you can access the instance variable 'a' here
        System.out.println("Inside display method, a = " + a);
    }

    public static void main(String args[]) {
        LocalVariables obj = new LocalVariables();
        obj.show();
        obj.display();
    }
}
