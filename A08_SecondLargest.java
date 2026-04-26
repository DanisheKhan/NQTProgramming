public class A08_SecondLargest {
  public int getSecondLargest(int[] arr) {
    int largest = arr[0];
    int secondLargest = -1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }
    }

    return secondLargest;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 2, 8, 1, 9, 3 };
    A08_SecondLargest obj = new A08_SecondLargest();
    int result = obj.getSecondLargest(arr);
    System.out.println("Second largest element: " + result);
  }
}
