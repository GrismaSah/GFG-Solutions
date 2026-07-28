class Solution {
    public void reverseArray(int nums[]) {
        int left = 0;
        int right = nums.length-1;
        
        while(left < right){
           int temp = nums[left];
           nums[left] = nums[right];
           nums[right] = temp;
           
           left++;
           right--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna