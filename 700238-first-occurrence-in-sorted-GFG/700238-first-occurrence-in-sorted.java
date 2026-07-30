class Solution {
    public int firstSearch(int[] arr, int k) {
        int first = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                first =  i;
                break;
            }
        }
        return first;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna