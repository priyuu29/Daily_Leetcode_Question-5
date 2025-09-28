// Last updated: 9/28/2025, 8:27:02 AM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int [][]dp=new int[matrix.length][matrix[0].length];
        for(int[] i:dp){
            Arrays.fill(i,-1000000);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            ans=Math.min(ans,min(matrix,0,i,dp));
        }
        return ans;
    }
    public int min(int [][] arr,int cr,int cc,int [][]dp){
        if(cc<0|| cc==arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(cr==arr.length-1){
            return arr[cr][cc];
        }
        if(dp[cr][cc]!=-1000000) return dp[cr][cc];
        int ld=min(arr,cr+1,cc-1,dp);
        int d=min(arr,cr+1,cc+1,dp);
        int rd=min(arr,cr+1,cc,dp);
        return dp[cr][cc]=Math.min(rd,Math.min(ld,d))+arr[cr][cc];
    }
}