class Solution {
    public int firstSearch(int[] arr, int k) {
        int first = -1;
        int left = 0; 
        int right = arr.length-1;
        
        while(left<=right){
            int mid = left + (right - left)/2;
            
            if(arr[mid] == k){
                first = mid;
                right = mid -1;
            }
            else if(arr[mid] > k){
                right = mid -1;
            }
            else{
                left = mid +1;;
            }
        }
        return first;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna