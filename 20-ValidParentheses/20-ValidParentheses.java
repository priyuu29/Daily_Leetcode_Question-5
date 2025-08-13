// Last updated: 8/13/2025, 10:27:18 AM
class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        return valid(s);
    }
    boolean valid(String s){
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='['|| ch=='('){
                st.push(ch);
            }
            else{
                if(ch==']'){
                    if(st.isEmpty() || st.pop()!='['){
                        return false;
                    }
                }
                if(ch==')'){
                    if(st.isEmpty() || st.pop()!='('){
                        return false;
                    }
                }
                if(ch=='}'){
                    if(st.isEmpty() || st.pop()!='{'){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}