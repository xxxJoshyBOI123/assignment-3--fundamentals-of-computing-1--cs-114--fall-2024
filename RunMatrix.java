import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Please enter the size of your matrix: ");
    int size = input.nextInt();
    System.out.println("Your matrix is " + size + "x" + size);


    int[][] matrix = new int[size][size];
    System.out.println("Printing matrix with default values: ");


    System.out.println("Populating matrix...matrix populated");
    int counter = 1;
    for(int row = 0; row < size;){
      for(int col = 0; col < size; col++){
        matrix[row][col] = counter++;
      }
    }
    System.out.println("Printing matrix:");
  }
}
