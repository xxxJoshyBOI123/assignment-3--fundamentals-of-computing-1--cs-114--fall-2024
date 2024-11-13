import java.util.Scanner;


public class RunMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Please enter the size of your matrix: ");
    int size = input.nextInt();
    System.out.println("Your matrix is " + size + "x" + size);


    Matrix table = new Matrix(size);


    System.out.println("\n Printing matrix with default values:");
    table.intializeMatrix();
    table.printMatrix();


    System.out.println("\n Populating matrix...matrix populated");
    table.populateMatrix();
    System.out.println("\n Printing matrix:");
    table.printMatrix();


    System.out.println("\n Flipping matrix...matrix flipped");
    table.flipMatrix();
    System.out.println("\n Printing flipped matrix:");
    table.printMatrix();


    input.close();
  }
}
