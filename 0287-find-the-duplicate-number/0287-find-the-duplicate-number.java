class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int k = nums[0];
        for(int i = 0 ;i < nums.length ; i++){
            if (nums[i] == nums[i+1]){
                k = nums[i];
                break;
            }
        }
    return k;
    }
}