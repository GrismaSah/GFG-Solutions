class Solution {
    public int firstRepeated(int[] arr) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0; i<arr.length; i++){
           map.put(arr[i], map.getOrDefault(arr[i] , 0) +1);
       }
       
       for(int i=0; i<arr.length; i++){
           if(map.get(arr[i]) > 1){
               return i+1;
           }
       }
       return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna