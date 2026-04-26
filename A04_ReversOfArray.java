import java.util.Arrays;

public class A04_ReversOfArray {
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void reverseArray(int arr[]) {
    int i = 0;
    int j = arr.length - 1;
    while (i <= j) {
      swap(arr, i, j);
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println("Original array: " + Arrays.toString(arr));
    reverseArray(arr);
    System.out.println("Reversed array: " + Arrays.toString(arr));
  }
}
