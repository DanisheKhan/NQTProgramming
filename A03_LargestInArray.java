public class A03_LargestInArray {
    public static int largest(int[] arr) {
        int largest = 0;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        int result = largest(arr);
        System.out.println("Largest element in array: " + result);
    }
}
