class Solution {
    public int[] dailyTemperatures(int[] t) {
        int size = t.length;
        int[] res = new int[size];
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<size; i++){
            while(!stk.isEmpty() && t[i] > t[stk.peek()]){
                int cnt = stk.pop();
                res[cnt] = i-cnt;
            }
            stk.push(i);
        }
        
        return res;
        
    }
}