public class Matrix {
  private int size;
  private int[][] matrix;

  public Matrix(int size) {
    this.size = size;
    this.matrix = new int[size][size];
  }

  public void IntializeMatrix() {
    for(int row = 0; row < size; row++) {
      for(int col = 0; col < size; col++) {
        matrix[row][col] = 0;
      }
    }
  }

  public void PopulateMatrix() {
    for(int row = 0; row < size; row++) {
      for(int col = 0; col < size; col++) {
        int temp = matrix[row][col];
        matrix[row][col] = matrix[row][size - col - 1];
        matrix[row][size - col - 1] = temp;
      }
    }
  }
  public void printMatrix() {
    for(int row = 0; row < size; row++) {
      for(int col = 0; col < size; col++) {
        System.out.print(matrix[row][col] + "\t");
      }
      System.out.println();
    }
  }
}
