class Solution {
    public int thirdLargest(List<Integer> arr) {
        // Coaching Analysis:
        // Your logic for tracking the top three elements is mostly correct.
        // Time Complexity: O(n) - Single pass through the list.
        // Space Complexity: O(1) - Only three variables used.
        // This is the optimal complexity for this problem.
        
        // Potential Edge Case: If the input list has fewer than 3 distinct elements, 
        // the problem usually expects -1 or a specific value. Your initialization 
        // to -1 handles this, provided the array contains only non-negative integers.
        
        int largest = -1;
        int secondlargest = -1;
        int thirdlargest  = -1;
        
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) >= largest){
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = arr.get(i);
            }
            else {
                if(arr.get(i) >= secondlargest && arr.get(i) != largest){
                thirdlargest = secondlargest;
                secondlargest = arr.get(i);
                }
                else{
                    if(arr.get(i) >= thirdlargest && arr.get(i) != secondlargest && arr.get(i) != largest){
                        thirdlargest = arr.get(i);
                    }
                    
                }
            }
        }
        // Your solution is efficient and correct. You can now click the Git icon 
        // in the toolbar to push this to your GitHub repository!
        return thirdlargest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna