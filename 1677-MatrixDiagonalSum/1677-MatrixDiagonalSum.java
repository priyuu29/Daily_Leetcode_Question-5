// Last updated: 10/1/2025, 8:40:38 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        int m=0,n=0;
        int l=mat.length;
        while(m<mat.length){
            while(n<mat[0].length){
                if(m==n) s+=mat[m][n];
                s+=mat[m][l-n-1];
                m++;
                n++;
            }
        }
        if(l%2!=0) s-=mat[l/2][l/2];
        return s;
    }

}