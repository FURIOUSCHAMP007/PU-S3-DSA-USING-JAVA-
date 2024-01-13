public class TOH {
  public static void main(String[] args) {
    int numberOfDisks = 3;
    char source = 'A';
    char auxiliary = 'B';
    char destination = 'C';
    System.out.println(
        "Steps to solve Tower of Hanoi with " + numberOfDisks + " disks:");
    solveTowerOfHanoi(numberOfDisks, source, auxiliary, destination);
  }
  public static void solveTowerOfHanoi(
      int n, char source, char auxiliary, char destination) {
    if (n == 1) {
      System.out.println("Move disk from " + source + " to " + destination);
      return;
    } else {
      solveTowerOfHanoi(n - 1, source, destination, auxiliary);
      solveTowerOfHanoi(1, source, auxiliary, destination);
      solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }
  }
}
