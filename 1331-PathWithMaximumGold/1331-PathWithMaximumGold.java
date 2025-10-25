// Last updated: 10/25/2025, 3:57:45 PM
class Solution {
    int[] x={-1,0,0,1};
    int[] y={0,-1,1,0};
    public int getMaximumGold(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    ans=Math.max(ans,dfs(i,j,grid));
                }
            }
        }
        return ans;
    }
    int dfs(int i,int j,int[][]grid){
        int n=grid.length,m=grid[0].length;

        if(i<0||i>=n||j<0||j>=m||grid[i][j]==0) return 0;
        int curr=grid[i][j];
        int sum=0;
        for(int ii=0;ii<4;ii++){
            int nx=i+x[ii],ny=j+y[ii];
            grid[i][j]=0;
            sum=Math.max(sum,curr+dfs(nx,ny,grid));
            grid[i][j]=curr;
        }
        return sum;
    }
}