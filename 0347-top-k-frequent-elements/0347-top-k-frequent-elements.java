class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer , Integer> map = new HashMap<>();
        for(int i =  0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        // Step 2: Convert map into list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort based on frequency (high to low)
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Step 4: Take first k elements
        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}