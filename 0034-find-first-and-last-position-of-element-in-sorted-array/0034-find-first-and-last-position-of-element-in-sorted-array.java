class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        int first = findFirst(nums, target);
        int second = findLast(nums, target);
        
        return new int[]{first , second};
    }

    private int findFirst(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int firstIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                firstIndex = mid;      // Record potential answer
                high = mid - 1;        // Keep looking left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return firstIndex;
    }

    private int findLast(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lastIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                lastIndex = mid;       // Record potential answer
                low = mid + 1;         // Keep looking right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastIndex;
    }
}
