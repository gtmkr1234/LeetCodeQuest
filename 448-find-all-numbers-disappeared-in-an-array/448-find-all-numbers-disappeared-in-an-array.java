class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int n = Math.abs(nums[i]);
            if(nums[n-1]>0){
                nums[n-1] = -1*nums[n-1];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0)
                res.add(i+1);
        }
        return res;
    }
}