class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                swap(matrix , i , j, j , i);
            }
        }
        for(int i = 0; i < n; i++){
            reverse(matrix, i);
        }
    }

    public void swap(int [][]arr , int a, int b , int x, int y){
        int temp = arr[a][b];
        arr[a][b] = arr[x][y];
        arr[x][y] = temp;
    }

    public void reverse(int [][]arr, int row){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[row][start];
            arr[row][start] = arr[row][end];
            arr[row][end] = temp;

            start++;
            end--;
        }
    }
}
