// Last updated: 8/13/2025, 10:25:50 AM
class Solution {
    public void reverseString(char[] s) {
        rs(s,0,s.length-1);
    }
    public void rs(char[] s, int i,int j){
        if(i>=j){
            return;
        }
        helper(s,i,j);
        rs(s,i+1,j-1);
    }
    void helper(char [] s, int i,int j){
        char ch=s[i];
        s[i]=s[j];
        s[j]=ch;
    }
}