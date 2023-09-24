public class FinalVariableExample {
    final int a = 10;

    void show() {
        System.out.println("a = " + a);
        // You cannot modify a final variable; attempting to do so will result in a compilation error
        // a = 20; // This line should be removed or commented out
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.show();
    }
}
