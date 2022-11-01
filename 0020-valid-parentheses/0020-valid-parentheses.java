class Solution {
    public boolean isValid(String s) {
        Stack <Character> stk = new Stack<>();
        for(int x=0; x<s.length(); x++){
            char i = s.charAt(x);
            if(i=='(' || i=='[' || i=='{'){
                stk.push(i);
                continue;
            }
            if(stk.isEmpty()){
                return false;
            }
            char test;
            switch(i){
                case ')':
                    test = stk.pop();
                    if(test=='[' || test=='{')
                        return false;
                    break;
                case '}':
                    test = stk.pop();
                    if(test=='[' || test=='(')
                        return false;
                    break;
                case ']':
                    test = stk.pop();
                    if(test=='(' || test=='{')
                        return false;
                    break;
            }
        }
        return stk.isEmpty();
    }
}