class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = nums[i-1] * ans[i-1];
        }
        
        int prod = 1;
        for(int j = n-1 ; j >= 0 ; j--){
            ans[j] = ans[j] * prod;
            prod = prod * nums[j];
        }
    return ans;

    }
}