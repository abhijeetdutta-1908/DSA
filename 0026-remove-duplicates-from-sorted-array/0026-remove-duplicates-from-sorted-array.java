class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet <Integer> set = new LinkedHashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int index = 0;
        for(int unique : set){
            nums[index] = unique;
            index++;
        }
        return set.size();
    }
}