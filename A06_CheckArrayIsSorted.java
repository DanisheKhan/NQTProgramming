public class A06_CheckArrayIsSorted {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    Solution solution = new Solution();
    System.out.println(solution.isSorted(arr));
  }
}

class Solution {
  public boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
