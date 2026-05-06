public class A12_StockBuyAndSell {
  public static void main(String[] args) {
    // Test Case 1: Standard case (Buy at 1, sell at 6)
    int[] prices1 = { 7, 1, 5, 3, 6, 4 };
    printResult(1, prices1, maxProfit(prices1), 5);

    // Test Case 2: Prices only go down (No profit possible)
    int[] prices2 = { 7, 6, 4, 3, 1 };
    printResult(2, prices2, maxProfit(prices2), 0);

    // Test Case 3: Prices only go up (Buy at 1, sell at 5)
    int[] prices3 = { 1, 2, 3, 4, 5 };
    printResult(3, prices3, maxProfit(prices3), 4);

    // Test Case 4: Dip at the end (Buy at 2, sell at 4)
    int[] prices4 = { 2, 4, 1 };
    printResult(4, prices4, maxProfit(prices4), 2);

    // Test Case 5: Multiple peaks (Buy at 2, sell at 6)
    int[] prices5 = { 3, 2, 6, 5, 0, 3 };
    printResult(5, prices5, maxProfit(prices5), 4);

    // Test Case 6: Single day (No profit possible)
    int[] prices6 = { 10 };
    printResult(6, prices6, maxProfit(prices6), 0);
  }

  public static void printResult(int testNum, int[] arr, int actual, int expected) {
    String status = (actual == expected) ? "✅ PASS" : "❌ FAIL";
    System.out.print(status + " | Test " + testNum + ": [");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
    }
    System.out.println("] -> Expected: " + expected + ", Actual: " + actual);
  }

  public static int maxProfit(int[] prices) {
    // Handle edge case for empty or single-day arrays
    if (prices == null || prices.length < 2) {
      return 0;
    }

    int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      int profit = prices[i] - minPrice;
      maxProfit = Math.max(maxProfit, profit);
      minPrice = Math.min(minPrice, prices[i]);
    }

    return maxProfit;
  }
}