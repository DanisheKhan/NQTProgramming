public class A11_EqualSum {
  public static void main(String[] args) {
    // Test Case 1: Expected Index 3 (1+2+3 = 6 and 6=6)
    int[] arr1 = { 1, 2, 3, 4, 6 };
    printResult(1, arr1, findEquilibriumIndex(arr1), 3);

    // Test Case 2: Expected Index -1 (No solution)
    int[] arr2 = { 1, 2, 3 };
    printResult(2, arr2, findEquilibriumIndex(arr2), -1);

    // Test Case 3: Expected Index 0 (Left/Right sums are both 0)
    int[] arr3 = { 10 };
    printResult(3, arr3, findEquilibriumIndex(arr3), 0);

    // Test Case 4: Expected Index 3 (-7+1+5 = -1 and -4+3+0 = -1)
    int[] arr4 = { -7, 1, 5, 2, -4, 3, 0 };
    printResult(4, arr4, findEquilibriumIndex(arr4), 3);

    // Test Case 5: Expected Index 4 (0+0+0+0 = 0 and right is 0)
    int[] arr5 = { 0, 0, 0, 0, 1 };
    printResult(5, arr5, findEquilibriumIndex(arr5), 4);

    // Test Case 6: Expected Index 2 (1000+2000 = 3000 and 3000=3000)
    int[] arr6 = { 1000, 2000, 3000, 3000 };
    printResult(6, arr6, findEquilibriumIndex(arr6), 2);
  }

  public static void printResult(int testNum, int[] arr, int actual, int expected) {
    String status = (actual == expected) ? "✅ PASS" : "❌ FAIL";
    System.out.print(status + " | Test " + testNum + ": [");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
    }
    System.out.println("] -> Expected: " + expected + ", Actual: " + actual);
  }

  public static int findEquilibriumIndex(int[] arr) {
    int n = arr.length;

    int totalSum = 0;
    for (int i = 0; i < n; i++) {
      totalSum = totalSum + arr[i];
    }

    int leftSum = 0;
    for (int i = 0; i < n; i++) {
      // Current rightSum is total minus what's on the left and the current element
      int rightSum = totalSum - leftSum - arr[i];

      if (leftSum == rightSum) {
        return i;
      }

      // Update leftSum for the NEXT iteration
      leftSum = leftSum + arr[i];
    }

    return -1;
  }
}
