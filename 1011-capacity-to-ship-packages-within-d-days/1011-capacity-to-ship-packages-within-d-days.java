class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, days, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    
    private boolean canShip(int[] weights, int maxDays, int capacity) {
        int currentDayWeight = 0;
        int requiredDays = 1;
        
        for (int weight : weights) {
            if (currentDayWeight + weight > capacity) {
                requiredDays++;
                currentDayWeight = 0;
            }
            currentDayWeight += weight;
        }
        return requiredDays <= maxDays;
    }
}
