class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int cmp = target - nums[i];
            if(hm.containsKey(cmp)){
                return new int[] {hm.get(cmp), i};
            }
            else{
                hm.put(nums[i],i);   
            }
        }
        return new int[] {};
    }
}