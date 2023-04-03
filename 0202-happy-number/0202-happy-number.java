class Solution {
    public static int sum(int n){
        int res=0;
        while(n>0){
            res+= (n%10)*(n%10);
            n /= 10; 
        }
        return res;
    }
    public boolean isHappy(int n) {
        // boolean res = false;
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int temp = sum(n);
            n=temp;
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
            }
        }
        return true;
    }
}