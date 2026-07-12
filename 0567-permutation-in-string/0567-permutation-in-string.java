class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        
        // If s1 is longer than s2, s2 cannot contain a permutation of s1
        if (len1 > len2) return false;
        
        // Frequency arrays for lowercase English letters
        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];
        
        // Count characters for the first window
        for (int i = 0; i < len1; i++) {
            s1Counts[s1.charAt(i) - 'a']++;
            s2Counts[s2.charAt(i) - 'a']++;
        }
        
        // Slide the window across s2
        for (int i = 0; i < len2 - len1; i++) {
            // If frequencies match, we found a permutation
            if (matches(s1Counts, s2Counts)) return true;
            
            // Move window forward: add next character, remove oldest character
            s2Counts[s2.charAt(i + len1) - 'a']++;
            s2Counts[s2.charAt(i) - 'a']--;
        }
        
        // Check the very last window position
        return matches(s1Counts, s2Counts);
    }
    
    // Helper method to compare character frequencies
    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
