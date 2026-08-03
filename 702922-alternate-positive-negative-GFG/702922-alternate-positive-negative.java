class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for (int num : arr) {
            if (num >= 0)
                pos.add(num);
            else
                neg.add(num);
        }

        arr.clear();

        int i = 0, j = 0;

        // Alternate positive and negative
        while (i < pos.size() && j < neg.size()) {
            arr.add(pos.get(i++));
            arr.add(neg.get(j++));
        }

        // Add remaining positives
        while (i < pos.size()) {
            arr.add(pos.get(i++));
        }

        // Add remaining negatives
        while (j < neg.size()) {
            arr.add(neg.get(j++));
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna