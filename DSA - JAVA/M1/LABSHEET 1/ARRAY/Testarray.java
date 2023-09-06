// Java Program to illustrate how to declare, instantiate, initialize, and traverse a Java array.
class Testarray {
    public static void main(String args[]) {
        int a[] = new int[5]; // Declaration and instantiation
        a[0] = 10; // Initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        // Traversing the array
        for (int i = 0; i < a.length; i++) // Length is the property of the array
            System.out.println(a[i]);
    }
}
