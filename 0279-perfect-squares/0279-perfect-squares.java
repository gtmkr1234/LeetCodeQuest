class Solution {
    public int numSquares(int n) {
        int[] nums = new int[n+1];
        Arrays.fill(nums,n);
        nums[0] = 0; 
        nums[1] = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j*j<=i; j++){
                if(i- j*j >= 0){
                    nums[i]= Math.min(nums[i - j*j]+1, nums[i]);
                }
            }
        }
        return nums[n];
    }
}