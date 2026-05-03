import java.util.*;

public class A09_ArraySubset {
  public static void main(String[] args) {
    // Test Case 1: arr2 is subset of arr1
    int[] arr1_1 = { 1, 2, 3, 4, 5 };
    int[] arr2_1 = { 2, 4 };
    System.out.println("Test 1: " + isSubset(arr1_1, arr2_1) + " (Expected: true)");

    // Test Case 2: arr2 is not subset of arr1
    int[] arr1_2 = { 1, 2, 3, 4, 5 };
    int[] arr2_2 = { 2, 6 };
    System.out.println("Test 2: " + isSubset(arr1_2, arr2_2) + " (Expected: false)");

    // Test Case 3: Single element subset
    int[] arr1_3 = { 1, 2, 3 };
    int[] arr2_3 = { 2 };
    System.out.println("Test 3: " + isSubset(arr1_3, arr2_3) + " (Expected: true)");

    // Test Case 4: Empty subset
    int[] arr1_4 = { 1, 2, 3 };
    int[] arr2_4 = {};
    System.out.println("Test 4: " + isSubset(arr1_4, arr2_4) + " (Expected: true)");

    // Test Case 5: Full subset (arr2 = arr1)
    int[] arr1_5 = { 1, 2, 3 };
    int[] arr2_5 = { 1, 2, 3 };
    System.out.println("Test 5: " + isSubset(arr1_5, arr2_5) + " (Expected: true)");
  }

  public static boolean isSubset(int[] arr1, int[] arr2) {
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    int i = 0;
    int j = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] == arr2[j]) {
        i++;
        j++;
      } else if (arr1[i] < arr2[j]) {
        i++;
      } else {
        return false;
      }

    }

    if (j == arr2.length) {
      return true;
    } else {
      return false;
    }

  }
}
