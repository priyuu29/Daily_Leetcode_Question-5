// Last updated: 8/13/2025, 10:23:38 AM
class Solution {
    public boolean canBeValid(String s, String locked) {
        int oc=0;
        int cc=0;
        int n=s.length();
        if(n%2!=0){
            return false;
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || locked.charAt(i)=='0'){
                oc++;
            }
            else{
                oc--;
            }
            if(oc<0){
                return false;
            }
        }
        for(int i=n-1;i>0;i--){
            if(s.charAt(i)==')' || locked.charAt(i)=='0'){
                cc++;
            }
            else{
                cc--;
            }
            if(cc<0){
                return false;
            }
        }
        return true;
    }
}