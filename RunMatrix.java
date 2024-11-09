import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the size of your matrix: ");
    int size = input.nextInt();
    System.out.println("Your matriz is " + size + "x" + size);
  }
}
