class Solution {
    public int numberOfSubstrings(String s) {
        int[] counts = new int[3];
        int left = 0;
        int totalSubstrings = 0;
        int n = s.length();
        
        for (int right = 0; right < n; right++) {
            counts[s.charAt(right) - 'a']++;    // if its a then 97 - 97 (ascii) ,if its b then 98-97 = 1 which makes counts[1]++ which is for b ..... can use a hashmap also.
            
            while (counts[0] > 0 && counts[1] > 0 && counts[2] > 0) {
                totalSubstrings += (n - right);
                counts[s.charAt(left) - 'a']--;
                left++;
            }
        }
        
        return totalSubstrings;
    }
}
