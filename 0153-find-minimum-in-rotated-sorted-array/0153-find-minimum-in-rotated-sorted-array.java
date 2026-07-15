class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -  1;
        int ans = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]){
                right = mid;
            }
            else{
                left = mid + 1;
            }
            ans = nums[mid];
        }
        return ans;
    }
}