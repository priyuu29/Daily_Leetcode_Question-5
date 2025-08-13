// Last updated: 8/13/2025, 10:26:11 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==0){
        //     return false;
        // }
        // return (n&(n-1))==0;
        return ist(n);
    }
    boolean ist(int n){
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return ist(n/2);
    }
}