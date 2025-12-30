import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        //a and b are two intervals.Each interval is like [start,end]     
        //a[0] = start of first interval  b[0] = start of second interval

        List<int[]> result = new ArrayList<>();
        
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            // If overlap → merge
            if (currStart <= end) {
                end = Math.max(end, currEnd);
            } 
            else {
                // No overlap → push current interval
                result.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        // Add the last interval
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}
