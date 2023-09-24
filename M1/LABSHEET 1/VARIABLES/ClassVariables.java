public class ClassVariables {
    int x = 100;

    public void show() {
        System.out.println("Inside show method, x = " + x);
        x = x + 100;
    }

    public void display() {
        System.out.println("Inside display method, x = " + x);
    }

    public static void main(String[] args) {
        ClassVariables obj = new ClassVariables();
        obj.show();
        obj.display();
    }
}
