// Last updated: 8/13/2025, 10:26:22 AM
class Solution {
    public boolean isHappy(int n) {
        // int p=n;
        // int rev=n;
        if(n<1){
            return false;
        }
        if(n==1 || n==7){
            return true;
        }
        while(n>=10){
            int sum=0;
            while(n>=1){
                int r=n%10;
                sum+=r*r;
                n/=10;
            }
            if(sum==1 || sum==7){
                return true;
            }
            else{
                n=sum;
                // sum=0;
            }
        }
        return n==1;
    }
}