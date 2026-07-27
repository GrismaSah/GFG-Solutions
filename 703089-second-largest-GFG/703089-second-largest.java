class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondlargest = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
                
            }
            else{
                if(arr[i] > secondlargest && arr[i] != largest){
                    secondlargest = arr[i];
                }
            }
        }
        return secondlargest;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna