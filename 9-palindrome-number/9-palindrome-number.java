class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ||(x%10==0 && x!=0))
            return false;
        int reversenum=0,pop;
        while(x>reversenum){
            pop=x%10;
            reversenum=reversenum*10 + pop;
            x=x/10;
        }
        return x==reversenum || x== reversenum/10;
    }
}