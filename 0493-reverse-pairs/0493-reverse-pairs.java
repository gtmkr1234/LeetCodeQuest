class Solution {
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;      
        int right = mid + 1;  



        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }



        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }


        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    static int countPairs(int[] arr, int start, int mid, int end){
        int count=0;
        int right = mid+1;
        for(int i=start; i<=mid ; i++){
            while((right<=end) && ((long)arr[i]>(long)2*arr[right])) right++;
            count += (right-(mid+1)); 
        }
        return count;
    }
    
    public static int mergesort(int[] arr, int start, int end){
        int cnt = 0;
        if(start>=end) return cnt;
        int mid = (start+end)/2;
        cnt += mergesort(arr, start,mid);
        cnt += mergesort(arr,mid+1, end);
        cnt += countPairs(arr, start, mid, end);
        merge(arr, start, mid, end);
        return cnt;
    }
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergesort(nums, 0, n-1);
    }
}