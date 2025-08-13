// Last updated: 8/13/2025, 10:24:09 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        return max(accounts);
    }
    public int max(int [][]acc){
        int max=0;
        int sum=0;
        for(int i=0;i<acc.length;i++){
            for(int j=0;j<acc[0].length;j++){
                sum+=acc[i][j];
            }
            max=Math.max(max,sum);
            sum=0;
        }
        max=Math.max(max,sum);
        return max;
    }
}