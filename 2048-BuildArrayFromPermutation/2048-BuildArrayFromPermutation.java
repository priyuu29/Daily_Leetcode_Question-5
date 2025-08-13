// Last updated: 8/13/2025, 10:23:47 AM
class Solution {
    public int[] buildArray(int[] nums) {
        return array(nums);
    }
    public static int[] array(int [] nums){
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            // int in=nums[i];
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}