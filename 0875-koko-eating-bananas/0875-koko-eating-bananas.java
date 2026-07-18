public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find the maximum pile size to set the upper boundary
        int maxPile = 0;
        for (int pile : piles) {
            if (pile > maxPile) {
                maxPile = pile;
            }
        }
        
        int left = 1;          // Minimum possible speed
        int right = maxPile;   // Maximum useful speed
        int answer = maxPile;  // Stores our best working speed
        
        // Binary search process
        while (left <= right) {
            int mid = (left + right) / 2; // Test the middle speed
            
            // Calculate total hours needed at speed 'mid'
            long totalHours = 0;
            for (int pile : piles) {
                int hoursForThisPile = pile / mid;
                if (pile % mid != 0) {
                    hoursForThisPile++; // Add 1 hour for leftovers
                }
                totalHours += hoursForThisPile;
            }
            
            // Check if speed 'mid' allows Koko to finish in time
            if (totalHours <= h) {
                answer = mid;       // Save this valid speed
                right = mid - 1;    // Try to find a slower speed on the left side
            } else {
                left = mid + 1;     // Too slow! Look for faster speeds on the right side
            }
        }
        
        return answer;
    }
}
