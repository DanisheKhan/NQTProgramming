import java.util.ArrayList;

public class A05_RemoveDuplicateSortedArray {

  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };
    Solution sol = new Solution();
    ArrayList<Integer> result = sol.removeDuplicates(arr);
    System.out.println("Array after removing duplicates: " + result);
  }
}

class Solution {
  ArrayList<Integer> removeDuplicates(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (i == 0 || arr[i] != arr[i - 1]) {
        list.add(arr[i]);
      }
    }
    return list;
  }
}