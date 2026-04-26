public class A01_SumOfArray {
  public static int arraySum(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
  public static void main(String[] args) {
   int[] numbers = {1, 2, 3, 4, 5};
   int sum = arraySum(numbers);
   System.out.println("The sum of the array is: " + sum);
  }

  
}
