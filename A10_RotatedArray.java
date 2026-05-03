public class A10_RotatedArray {
  public static void main(String[] args) {
    // Test Case 1: Rotate by 2
    int[] arr1 = { 1, 2, 3, 4, 5 };
    System.out.print("Test 1 - Rotate by 2: ");
    rotate(arr1, 2);
    printArray(arr1);
    System.out.println("(Expected: 3 4 5 1 2)");

    // Test Case 2: Rotate by 1
    int[] arr2 = { 1, 2, 3, 4, 5 };
    System.out.print("Test 2 - Rotate by 1: ");
    rotate(arr2, 1);
    printArray(arr2);
    System.out.println("(Expected: 2 3 4 5 1)");

    // Test Case 3: Rotate by array length (full rotation)
    int[] arr3 = { 1, 2, 3, 4, 5 };
    System.out.print("Test 3 - Rotate by 5: ");
    rotate(arr3, 5);
    printArray(arr3);
    System.out.println("(Expected: 1 2 3 4 5)");

    // Test Case 4: Single element
    int[] arr4 = { 7 };
    System.out.print("Test 4 - Single element, rotate by 1: ");
    rotate(arr4, 1);
    printArray(arr4);
    System.out.println("(Expected: 7)");

    // Test Case 5: Rotate by 3
    int[] arr5 = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.print("Test 5 - Rotate by 3: ");
    rotate(arr5, 3);
    printArray(arr5);
    System.out.println("(Expected: 4 5 6 7 1 2 3)");
  }

  public static void rotate(int[] nums, int d) {
    int n = nums.length;
    d = d % n;

    reverse(nums, 0, d - 1);
    reverse(nums, d, n - 1);
    reverse(nums, 0, n - 1);
  }

  static void reverse(int nums[], int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
