class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> maps = new HashMap<>();
        int left=0, right = 0, n = s.length();
        int len=0;
        int max = 0;
        while(right < n){
            if(maps.containsKey(s.charAt(right))){
                left = Math.max(left, maps.get(s.charAt(right))+1);
            }
            maps.put(s.charAt(right), right);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}