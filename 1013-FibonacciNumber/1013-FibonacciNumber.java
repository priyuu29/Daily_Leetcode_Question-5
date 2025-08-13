// Last updated: 8/13/2025, 10:24:58 AM
class Solution {
    public int fib(int n) {
       return fb(n);
    }
    int fb(int n){
        if(n<2){
            return n;
        }
        return fb(n-1)+fb(n-2);
        // return f;
    }
}