// Last updated: 8/13/2025, 10:25:13 AM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1) return cost[0];
        if(cost.length==2) return Math.min(cost[0],cost[1]);
        int f=cost[0];
        int s=cost[1];
        for(int i=2;i<cost.length;i++){
            int c=Math.min(f,s)+cost[i];
            f=s;
            s=c;
        };
        return Math.min(f,s);
    }
}