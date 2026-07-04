import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int ansIdx = 0;
        
        // Deque to store indices of elements
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int right = 0; right < n; right++) {
            // 1. Remove indices that are out of the current window bounds
            if (!deque.isEmpty() && deque.peekFirst() < right - k + 1) {
                deque.pollFirst();
            }
            
            // 2. Remove elements from the back that are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[right]) {
                deque.pollLast();
            }
            
            // 3. Add the current element's index to the back
            deque.offerLast(right);
            
            // 4. If the window has reached size k, record the maximum
            if (right >= k - 1) {
                ans[ansIdx++] = nums[deque.peekFirst()];
            }
        }
        
        return ans;
    }
}
