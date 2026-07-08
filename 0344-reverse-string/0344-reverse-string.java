class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        for(int j = s.length - 1 ; j > i ; j--){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
        }
    }
}