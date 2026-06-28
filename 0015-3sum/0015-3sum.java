class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i + 1 ; j < nums.length; j++){
                int k = -(nums[i] + nums[j]);
                
                if(set.contains(k)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], k);
                    Collections.sort(temp); 
                    ans.add(temp);
                }

                set.add(nums[j]);
            }
        }
    return new ArrayList<>(ans);
    }
}