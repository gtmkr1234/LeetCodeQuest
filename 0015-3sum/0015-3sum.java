class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            HashSet<Integer> st = new HashSet<>();
            for(int j = i+1; j<nums.length; j++){
                int third = -(nums[i]+nums[j]);
                if (st.contains(third)){
                    List rs = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(rs);
                    set.add(rs);
                }
                st.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList(set);
        return ans;
    }
}