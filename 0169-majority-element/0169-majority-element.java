class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i<n ; i++){
            int num = nums[i];
            if(map.containsKey(num)){
                map.put(num , map.get(num)+1);
            }
            else{
                map.put(num , 1);
            }
            if(map.get(num)>(n/2)){
                return num;
            }
        }
        return -1;
    }
}