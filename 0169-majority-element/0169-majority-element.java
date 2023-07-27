class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int el = nums[0];
        for(int i=0; i<nums.length; i++){
            if(count==0){
                count=1;
                el = nums[i];
            }
            else if(nums[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        int c1=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==el) c1++;
        }
        return c1>nums.length/2?el:-1;
    }
}