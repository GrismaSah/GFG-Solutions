class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = firstOcurrence(nums, target);
        int last = lastOcurrence(nums, target);

        return new int[] {first, last};
    }

    public int firstOcurrence(int[] nums, int target){
        int left = 0;
        int right = nums.length-1; 
        int first = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                first = mid;
                right = mid-1;
            }
            else if(nums[mid] > target ){
                right  = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return first;
    }

    public int lastOcurrence(int[] nums, int target){
        int left = 0;
        int right = nums.length-1; 
        int last = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                last = mid;
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return last;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna