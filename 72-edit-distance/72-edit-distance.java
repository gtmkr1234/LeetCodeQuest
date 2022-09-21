class Solution {
    static int min(int a, int b, int c){
        int l = Math.min(a,b);
        return Math.min(c,l);
    }
    public int minDistance(String word1, String word2) {
        char[] a1 = word1.toCharArray();
        char[] a2 = word2.toCharArray();
        int [][] temp = new int[a1.length+1][a2.length+1];
        for(int i=0; i<temp[0].length ; i++){
            temp[0][i] = i;
        }
        for(int i=0; i<temp.length; i++){
            temp[i][0] = i;
        }
        for(int i=1; i<=a1.length; i++){
            for(int j=1; j<=a2.length; j++){
                if(a1[i-1] == a2[j-1])
                    temp[i][j] = temp[i-1][j-1];
                else
                    temp[i][j] = 1 + min(temp[i-1][j-1],temp[i-1][j],temp[i][j-1]);
            }
        }
        return temp[a1.length][a2.length];
    }
}