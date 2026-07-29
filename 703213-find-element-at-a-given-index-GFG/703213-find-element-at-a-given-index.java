class Solution {
    public int findElementAtIndex(int i, int[] arr) {
        for(int j=0; j<arr.length; j++){
            if(i == j){
                return arr[j];
            }
        }
        return arr[i];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna