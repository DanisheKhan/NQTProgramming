// sum of array
class Solution {
    int arraySum(int arr[]) {
        int sum=0;
        for(int i=0; i<arr.length; i++){
        
           sum+=arr[i];
        };
        return sum;
    };
};

//Mean of array 
class Solution {
    public static int findMean(int[] arr) {
       int sum=0;
       int mean=0;
       for(int i=0; i<arr.length; i++){
           sum= sum+arr[i];
           
       }
       mean=sum/arr.length;
       return mean;
    }
};

//Largest in Array 
class Solution {
    public static int largest(int[] arr) {
        int largest =0;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            };
        }
        return largest;
    }
}

//Reverse Of Array
class Solution {
    public static void swap(int[]arr, int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverseArray(int arr[]) {
       int i=0;
       int j=arr.length-1;
       while(i<=j){
           swap(arr, i, j);
           i++;
           j--;
       };   
        
    }
}
  
//  Ramove Duplicate Sorted Array
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
       for (int i = 0; i < arr.length; i++) {
            if (i==0 || arr[i]!=arr[i-1] ) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}

// Check if array is sorted
class Solution {
    public boolean isSorted(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        };
        return true;
        
    };
};
