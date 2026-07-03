class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        boolean flag = false;
        int left = 0;
        int sum = 0;
        for (int right = left; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
                flag = true;
            }

        }
        if (flag == true)
            return minLength;
        else
            return 0;
    }
}