public class StaticVariablesExample {
    int x, y; // Instance variables
    static int z; // Static variable

    StaticVariablesExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.println("Inside show method,");
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {
        StaticVariablesExample obj_1 = new StaticVariablesExample(10, 20);
        StaticVariablesExample obj_2 = new StaticVariablesExample(100, 200);
        obj_1.show();
        StaticVariablesExample.z = 1000;
        obj_2.show();
    }
}
