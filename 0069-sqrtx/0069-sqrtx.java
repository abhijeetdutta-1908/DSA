class Solution {
    public int mySqrt(int x) {
        // Handle edge cases explicitly
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 1;
        int right = x;
        int ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Use division instead of multiplication to prevent overflow
            if (mid <= x / mid) {
                ans = mid;      // mid could be the potential floor square root
                left = mid + 1; // Try to find a larger valid value
            } else {
                right = mid - 1; // mid is too large
            }
        }
        
        return ans;
    }
}
