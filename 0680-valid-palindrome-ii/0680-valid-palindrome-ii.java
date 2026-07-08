class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            // If characters mismatch, simulate deleting one of them
            if (s.charAt(i) != s.charAt(j)) {
                return isPurePalindrome(s, i + 1, j) || isPurePalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        
        return true;
    }
    
    // Helper method to check if a specific substring is a perfect palindrome
    private boolean isPurePalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
