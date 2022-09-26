class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,1);
        
        for(int i=nums.length-1; i>=0; i--){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j])
                    arr[i] = Math.max(arr[i], 1+arr[j]);
            }
        }
        return maxValue(arr);
    }
    
    private static int maxValue(int[] arr) {
    int max = arr[0];
    for (int ktr = 0; ktr < arr.length; ktr++) {
        if (arr[ktr] > max) {
            max = arr[ktr];
        }
    }
    return max;
}
}
