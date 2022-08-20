class Solution {
    //Using two-pointer approach and three-pointer approach
    //Two pointer + helper pointer approach
    //if mid pointer surpasses high pointer, the array is sorted
    public void sortColors(int[] nums) {
        int len = nums.length;
        int low = 0;
        int mid = 0;
        int high = len-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low +=1;
                mid +=1;
            }
            else if(nums[mid]==1)
                mid+=1;
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high -=1;
            }
        }
        
        
    }
}