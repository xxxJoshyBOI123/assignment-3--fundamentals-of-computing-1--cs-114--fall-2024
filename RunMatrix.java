import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Please enter the size of your matrix: ");
    int size = input.nextInt();
    System.out.println("Your matrix is " + size + "x" + size);

    Matrix table = new Matrix(size);

    System.out.println("\n Populating matrix...matrix populated");
    table.IntializeMatrix();
    table.printMatrix();


  }
}
