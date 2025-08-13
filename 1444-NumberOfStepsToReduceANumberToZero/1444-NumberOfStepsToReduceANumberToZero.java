// Last updated: 8/13/2025, 10:24:43 AM
class Solution {
    public int numberOfSteps(int num) {
        return nos(num,0);
    }
    int nos(int n,int s){
        if(n==0){
            return s;
        }
        if((n&1)==1){
            return nos(n-1,s+1);
        }
        return nos(n/2,s+1);
        
    }
}