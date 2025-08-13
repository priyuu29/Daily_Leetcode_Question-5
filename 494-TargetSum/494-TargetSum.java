// Last updated: 8/13/2025, 10:25:31 AM
class Solution {
    int c;
    public void find(int [] nums,int i,int target,int sum){
        if(i==nums.length){
            if(sum==target){
                c++;
            }
            return;
        }
        find(nums,i+1,target,sum-nums[i]);
        find(nums,i+1,target,sum+nums[i]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        c=0;
        find(nums,0,target,0);
        return c;
    }
}