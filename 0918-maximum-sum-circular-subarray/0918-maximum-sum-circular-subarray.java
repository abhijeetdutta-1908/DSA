class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxAns = nums[0];
        int minAns = nums[0];
        
        int currentMaxSum = 0;
        int currentMinSum = 0;
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];

            // 1. Kadane's Algorithm for Maximum Subarray
            currentMaxSum += nums[i];
            maxAns = Math.max(maxAns, currentMaxSum);
            if (currentMaxSum < 0) {
                currentMaxSum = 0;
            }

            // 2. Kadane's Algorithm for Minimum Subarray (The Missing Piece)
            currentMinSum += nums[i];
            minAns = Math.min(minAns, currentMinSum);
            if (currentMinSum > 0) {
                currentMinSum = 0;
            }
        }

        // Edge Case: If all numbers are negative, maxAns will be negative.
        // Returning (totalSum - minAns) would mistakenly return 0 (empty subarray).
        if (maxAns < 0) {
            return maxAns;
        } 
        
        return Math.max(maxAns, totalSum - minAns);
    }
}
