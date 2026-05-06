public class A13_AdditionOfTwoSquareMatrix {
  public void Addition(int[][] matrixA, int[][] matrixB) {
    int n = matrixA.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
      }
    }
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    A13_AdditionOfTwoSquareMatrix solution = new A13_AdditionOfTwoSquareMatrix();

    // Test Case 1: 2x2 Matrix
    System.out.println("Test Case 1: 2x2 Matrix");
    int[][] a1 = {{1, 2}, {3, 4}};
    int[][] b1 = {{5, 6}, {7, 8}};
    solution.Addition(a1, b1);
    printMatrix(a1); // Expected: 6 8, 10 12

    // Test Case 2: 1x1 Matrix
    System.out.println("\nTest Case 2: 1x1 Matrix");
    int[][] a2 = {{10}};
    int[][] b2 = {{20}};
    solution.Addition(a2, b2);
    printMatrix(a2); // Expected: 30

    // Test Case 3: 3x3 Matrix with zeros and negatives
    System.out.println("\nTest Case 3: 3x3 Matrix");
    int[][] a3 = {{1, 0, -1}, {2, 2, 2}, {0, 5, 10}};
    int[][] b3 = {{1, 1, 1}, {-2, -2, -2}, {5, 5, 5}};
    solution.Addition(a3, b3);
    printMatrix(a3); // Expected: 2 1 0, 0 0 0, 5 10 15
  }
}
