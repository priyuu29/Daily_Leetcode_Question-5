// Last updated: 9/28/2025, 8:26:55 AM
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        return lcs(nums1,nums2);
    }
    public int lcs(int[] t1,int []t2){
        int dp[][]=new int[t1.length+1][t2.length+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(t1[i-1]==t2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    int f=dp[i][j-1];
                    int s=dp[i-1][j];
                    dp[i][j]=Math.max(f,s);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}