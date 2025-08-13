// Last updated: 8/13/2025, 10:22:43 AM
class Solution {
    public int numberOfChild(int n, int k) {
        int count=0;
        k=k%(2*n-2);
        if(k<n){
            return k;
        }
        return 2*n-2-k;
    }
}