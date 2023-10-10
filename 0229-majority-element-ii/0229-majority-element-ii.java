class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0, cnt2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(cnt1==0 && nums[i]!=el2){
                el1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2==0 && nums[i]!=el1){
                el2 = nums[i];
                cnt2=1;
            }
            else if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        cnt1=0;
        cnt2=0;
        int val = (int) n/3 +1 ;
        for(int i=0; i<n; i++){
            if(nums[i]==el1) cnt1++;
            if(nums[i]==el2) cnt2++;
        }
        if(cnt1>= val){
            res.add(el1);
        }
        if(cnt2>= val){
            res.add(el2);
        }
        res.sort(Comparator.naturalOrder());
        return res;
    }
}