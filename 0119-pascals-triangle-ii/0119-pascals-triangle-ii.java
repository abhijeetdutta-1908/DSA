class Solution {
    public List<Integer> generateRows(int row){
        List<Integer> rowList = new ArrayList<>();
        long ans = 1;
        rowList.add(1);
        for(int i = 1; i<= row ; i++){
            ans = ans*(row-i+1)/i;
            rowList.add((int)ans);
        }
        return rowList;
    }

    public List<Integer> getRow(int rowIndex) {
       return generateRows(rowIndex);
    }
}