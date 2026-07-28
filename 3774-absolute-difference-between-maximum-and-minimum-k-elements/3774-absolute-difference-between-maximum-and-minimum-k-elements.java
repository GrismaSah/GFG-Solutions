class Solution {
    public int absDifference(int[] nums, int k) {

        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);

        int minsum = 0;
        int maxsum = 0;
        for(int i=0; i<k; i++){
            minsum += nums[i];
            maxsum += nums[nums.length-1-i];
        }

        int difference = Math.abs(maxsum - minsum);

        return difference;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna