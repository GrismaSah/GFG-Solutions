class Solution {
    public int maximumCount(int[] nums) {
        int count = 0;
        int numbers = 0; 
        int maxcount = 0;
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] < 0){
                count++;
                maxcount = Math.max(count, numbers);
            }
            else if(nums[i] > 0){
                numbers++;
                maxcount = Math.max(count, numbers);
            }
        }
        return maxcount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna