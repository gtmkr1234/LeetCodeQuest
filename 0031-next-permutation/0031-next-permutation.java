class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        // Find the break pointer
        
        int ind=-1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind =i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0);
            return;
        }
        
        for(int i=n-1; i>ind; i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        
        reverse(nums, ind+1);
        return;
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int[] nums,int start){
        int end = nums.length-1;
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}