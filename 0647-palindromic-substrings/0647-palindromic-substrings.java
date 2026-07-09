class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int ax = 0; ax < s.length(); ax++) {
            int orb = 1;
            count++;
            while (ax - orb >= 0 && ax + orb < s.length()) {
                if (s.charAt(ax - orb) == s.charAt(ax + orb)) {
                    orb++;
                    count++;
                } else {
                    break;
                }
            }
        }

        //for even places(keep the axis in between two positions or index and start drawing a orbit)
        for (int ax = 0; ax < s.length(); ax++) {
            int orb = 1;
            while (ax - orb + 1 >= 0 && ax + orb < s.length()) {
                if (s.charAt(ax - orb + 1) == s.charAt(ax + orb)) {
                    orb++;
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}