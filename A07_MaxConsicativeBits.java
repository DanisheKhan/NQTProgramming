public class A07_MaxConsicativeBits {
  public static int maxConsecBits(int[] arr) {
    int count = 1;
    int max = 1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == arr[i - 1]) {
        count++;
        max = Math.max(max, count);
      } else {
        count = 1;
      }
    }

    return max;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 0, 0, 1, 0, 0, 1 };

    int result = maxConsecBits(arr);

    System.out.println("Max Consecutive Bits: " + result);
  }
}