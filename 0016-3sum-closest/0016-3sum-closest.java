class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum = nums[0] + nums[1] + nums[2];
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length -2 ; i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j<k){
                if(nums[i] + nums[j] + nums[k] == target ){
                    return target;
                }
                int diffToTarget =  Math.abs(target - (nums[i] + nums[j] + nums[k]));
                if(diffToTarget < minDiff){
                    resultSum = nums[i] + nums[j] + nums[k];
                    minDiff = diffToTarget;
                }
                if (nums[i] + nums[j] + nums[k] > target ){
                    k--;
                }
                else if (nums[i] + nums[j] + nums[k] < target ){
                    j++;
                }
                
            }
        }
    return resultSum;
    }
}