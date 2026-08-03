class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];
            if(set.contains(complement)){
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna