// Last updated: 8/13/2025, 10:22:50 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int mul=x;
        while(mul>0){
            int r=mul%10;
            sum=sum+r;
            mul/=10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}