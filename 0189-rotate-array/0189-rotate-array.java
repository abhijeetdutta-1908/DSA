class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int arr[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            int idx = (i+k) % nums.length;
            arr[idx] = nums[i];
        }
        for(int i = 0 ; i < nums.length ;i++){
            nums[i] = arr[i];
        }
    }
}