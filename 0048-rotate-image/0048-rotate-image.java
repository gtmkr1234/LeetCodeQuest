class Solution {
    public static void rev(int[] a){
        int n = a.length;
        for(int i=0; i<n/2; i++){
            int t = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = t;
        }
    }
    public void rotate(int[][] mat) {
        int n = mat.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            rev(mat[i]);
        }}
        
    }
