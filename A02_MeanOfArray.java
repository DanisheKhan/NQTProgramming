public class A02_MeanOfArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(findMean(arr));
  }

  public static int findMean(int[] arr) {
    int sum = 0;
    int mean = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    mean = sum / arr.length;
    return mean;
  }
}
