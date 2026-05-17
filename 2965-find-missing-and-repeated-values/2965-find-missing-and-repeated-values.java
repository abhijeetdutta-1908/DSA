class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int repeated = -1;
        int missing = -1;

        // Count frequency
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int num = grid[i][j];

                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
        }
        for (int i = 1; i <= n * n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    repeated = i;
                }
            } else {
                missing = i;
            }
        }
        return new int[]{repeated, missing};
    }
}