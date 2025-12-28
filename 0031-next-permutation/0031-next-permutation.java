class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i= n-2 ; i >= 0 ; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if (index == -1){
            reverseArray(nums , 0 , n-1);
            return;
        }
        for(int i = n-1 ; i >= 0 ; i--){
            if(nums[i] > nums[index])
            {
                swap(nums ,i , index);
                break;
            }
        }
        reverseArray(nums , index+1 , n-1);  
    }
    public void reverseArray(int[] arr,int start , int end) {
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}