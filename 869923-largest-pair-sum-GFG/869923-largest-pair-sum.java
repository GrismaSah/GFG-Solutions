class Solution {
    public static int pairsum(int[] arr) {
       if(arr.length < 2){
           return -1;
       }
       
       int largest =Integer.MIN_VALUE , secondlar = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
           if(arr[i]>largest){
               secondlar = largest;
               largest = arr[i];
           }
           if(arr[i] > secondlar && arr[i] != largest){
               secondlar = arr[i];
           }
       }
       int sum = largest + secondlar;
       return sum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna