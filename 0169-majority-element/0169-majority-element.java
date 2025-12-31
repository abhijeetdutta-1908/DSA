class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int currCount = 1;
        int maxCount = 1;
        int mode = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i-1]){
                currCount++;
            }
            else{
                currCount = 1;
            }
            if (currCount > maxCount){
                maxCount = currCount;
                mode = nums[i];
            }
        }
        return mode;
    }
}