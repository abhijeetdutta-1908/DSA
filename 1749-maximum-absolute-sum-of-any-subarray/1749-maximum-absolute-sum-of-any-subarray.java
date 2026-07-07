class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        int min = 0;
        int minSum = nums[0];
        for(int i = 0 ; i< nums.length ; i++){
            //kadane's algo for max subarray
            sum += nums[i];
            maxSum = Math.max(maxSum , sum);
            if(sum < 0 ){
                sum = 0;
            }

            //kadane's algo for min subarray
            min += nums[i];
            minSum = Math.min(minSum , min);
            if(min > 0){
                min = 0;
            }


        }
        return Math.max(maxSum , Math.abs(minSum));
    }
}