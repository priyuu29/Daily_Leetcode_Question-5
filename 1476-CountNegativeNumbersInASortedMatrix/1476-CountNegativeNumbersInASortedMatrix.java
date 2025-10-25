// Last updated: 10/25/2025, 3:57:40 PM
class Solution {
    public int countNegatives(int[][] grid) {
        // int j=0;
        int c=0;
        for(int i=grid.length-1;i>=0;i--){
           for(int j=grid[0].length-1;j>=0;j--){
                if(grid[i][j]<0) c++;
                else break;
           }
        }
        return c;
    }
}