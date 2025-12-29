class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int mid = 0;
        int high = n-1; 
        int low = 0;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums , low , mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums ,mid,high);
                high--;
            } 
        }
    }
    public void swap(int [] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}