public class Matrix {
  private int[][] matrix;


  public Matrix(int size) {
    this.matrix = new int[size][size];
  }


  public void intializeMatrix() {
    for(int row = 0; row < this.matrix.length; row++) {
      for(int col = 0; col < this.matrix[row].length; col++) {
        matrix[row][col] = 0;
      }
    }
  }


  public void populateMatrix() {
    int value = 1;
    for(int row = 0; row < this.matrix.length; row++) {
      for(int col = 0; col < this.matrix[row].length; col++) {
        matrix[row][col] = value++;
      }
    }
  }


  public void flipMatrix() {
    for(int row = 0; row < this.matrix.length; row++) {
      for(int col = 0; col < this.matrix[row].length; col++) {
        if(!this.isDiagonal(row, col)) { // highlight diagonal yellow
          int size = this.matrix[row].length - 1;
          swap(row, col, size - row, size - col);
        }  else {
             break;
        }
      }
    }
  }


  private void swap(int row1, int col1, int row2, int col2) {
    int temp = this.matrix[row1][col1];
    this.matrix[row1][col1] = this.matrix[row2][col2];
    this.matrix[row2][col2] = temp;
  }


  public boolean isDiagonal(int row, int col) {
    int maxIndex = this.matrix[row].length - 1;
    return col == (maxIndex - row);
  }


  public void printMatrix() {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_YELLOW = "\u001B[33m";
    for(int row = 0; row < this.matrix.length; row++) {
      for(int col = 0; col < this.matrix[row].length; col++) {
        int value = this.matrix[row][col];
        if(this.isDiagonal(row, col)) {
          System.out.printf("%s%d%s ", ANSI_YELLOW, value, ANSI_RESET);
        } else {
          System.out.printf("%d ", value);
        }
      }
      System.out.println();
    }
  }
}
