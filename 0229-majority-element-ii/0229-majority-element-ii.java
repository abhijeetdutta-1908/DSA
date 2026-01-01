class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int min = nums.length/3 + 1;
        int count1 = 0;
        int el1 = Integer.MIN_VALUE;
        int count2 = 0;
        int el2 = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(count1 == 0 && nums[i]!=el2 ){
                el1 = nums[i];
                count1 ++;
            }
            else if(count2 == 0 && nums[i]!=el1){
                el2 = nums[i];
                count2 ++;
            }
            else if(nums[i] == el1){
                count1++;
            }
            else if(nums[i] == el2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int ct1 = 0;
        int ct2 = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] == el1){
                ct1++;
            }
            if(nums[i] == el2){
                ct2++;
            }
        }
        if(ct1 >= min){
            result.add(el1);
        }
        if(ct2 >= min){
            result.add(el2);
        }
        return result;
    }
}