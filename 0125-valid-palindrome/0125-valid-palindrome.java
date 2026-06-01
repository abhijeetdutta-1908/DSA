class Solution {

    public boolean isAlphaNum(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    public boolean isPalindrome(String s) {

        int st = 0;
        int end = s.length() - 1;

        while (st < end) {

            if (!isAlphaNum(s.charAt(st))) {
                st++;
                continue;
            }

            if (!isAlphaNum(s.charAt(end))) {
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            st++;
            end--;
        }

        return true;
    }
}