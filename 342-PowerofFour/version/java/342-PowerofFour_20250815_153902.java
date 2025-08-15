// Last updated: 8/15/2025, 3:39:02 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        return ist(n);
    }
     boolean ist(int n){
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4!=0){
            return false;
        }
        return ist(n/4);
    }
}