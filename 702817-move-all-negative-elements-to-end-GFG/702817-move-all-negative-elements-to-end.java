class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int k=0;
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                temp[k++] = arr[i];
            }
        }
        
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                temp[k++] = arr[i];
            }
        }
        
        for(int i=0; i<temp.length; i++){
            arr[i] = temp[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna