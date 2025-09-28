// Last updated: 9/28/2025, 8:26:51 AM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][]dp=new int [text1.length()][text2.length()];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        return lcs(text1,text2,0,0,dp);
    }
    public int lcs(String t1,String t2,int i,int j,int dp[][]){
       if(i==t1.length() ||j==t2.length()) return 0;
       if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(t1.charAt(i)==t2.charAt(j)){
            ans=1+lcs(t1,t2,i+1,j+1,dp);
        }
        else{
            int f=lcs(t1,t2,i,j+1,dp);
            int s=lcs(t1,t2,i+1,j,dp);
            ans=Math.max(f,s);
        }
       return dp[i][j]=ans;
        // return ans;
    }
    // public int lcs(String t1,String t2){
    //     int dp[][]=new int[t1.length()+1][t2.length()+1];
    //     for(int i=1;i<dp.length;i++){
    //         for(int j=1;j<dp[0].length;j++){
    //             if(t1.charAt(i-1)==t2.charAt(j-1)){
    //                 dp[i][j]=1+dp[i-1][j-1];
    //             }
    //             else{
    //                 int f=dp[i][j-1];
    //                 int s=dp[i-1][j];
    //                 dp[i][j]=Math.max(f,s);
    //             }
    //         }
    //     }
    //     return dp[dp.length-1][dp[0].length-1];
    // }
}