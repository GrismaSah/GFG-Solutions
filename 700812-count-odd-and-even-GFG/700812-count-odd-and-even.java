class Solution {
    public int[] countOddEven(int[] arr) {
        
        int even_count = 0;
        int odd_count = 0;
        int k = 0;
        // int[] ans  = new int[2];
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] % 2 == 0){
        //         even_count++;
        //     }
        //     else{
        //         odd_count++;
        //     }
        // }
        // ans[0] = odd_count;
        // ans[1] = even_count;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        
        return new int[]{odd_count, even_count};
        

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna