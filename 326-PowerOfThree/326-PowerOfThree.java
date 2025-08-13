// Last updated: 8/13/2025, 10:25:53 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        return ist(n);
    }
     boolean ist(int n){
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3!=0){
            return false;
        }
        return ist(n/3);
    }
}