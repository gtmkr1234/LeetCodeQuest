class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m>=1){
        int left = m-1;
        int right = 0;
        while(left>=0 && right<n){
            if(nums1[left]>nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(nums2);
        Arrays.sort(nums1, 0, m-1);
        int j=0;
        for(int i=m; i<m+n; i++){
            nums1[i] = nums2[j];
            j++;
        }
            Arrays.sort(nums1);
        }
        else if(n>=1){
            for(int j=0; j<nums1.length; j++){
                nums1[j] = nums2[j];   
            }
        }
    }
}