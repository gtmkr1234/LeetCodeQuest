class Solution {
    public static List<Integer> generateRow(int row){
        List<Integer> resRow = new ArrayList<>();
        resRow.add(1);
        long ans =1;
        for(int col=1; col<row; col++){
            ans = ans*(row-col);
            ans = ans/col;
            resRow.add((int)ans);
        }
        return resRow;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            res.add(generateRow(i));
        }
        return res;
    }
}