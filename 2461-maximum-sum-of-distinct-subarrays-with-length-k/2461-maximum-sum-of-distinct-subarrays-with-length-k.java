class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
        HashSet<Integer> set = new HashSet<>();
        
        int left = 0;
        int right = 0;
        
        while (right < nums.length) {
            // 1. If we see a duplicate, shrink the window from the left
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            
            // 2. Add the current element to our window
            set.add(nums[right]);
            currentSum += nums[right];
            
            // 3. If our window reaches size k, check the sum and slide left forward
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                
                // Remove the leftmost element to prepare for the next step
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            
            // Move right pointer forward to expand the window
            right++;
        }
        
        return maxSum;
    }
}
