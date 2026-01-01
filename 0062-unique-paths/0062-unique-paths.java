class Solution {
    public int uniquePaths(int m, int n) {
        int N = m+n-2;    //total no of steps needed to reach that place( m - 1 + n - 1)
        int r = Math.min(m - 1, n - 1);    //can be n-1 also 
        //now we have to find NCr(combinations)
        long result = 1;
        for(int i = 1 ; i <= r ; i++){
            result = (result * (N-r+i))/i;
        }

        return (int)result;
    }
}