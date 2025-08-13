// Last updated: 8/13/2025, 10:23:44 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        return array(nums);
    }
    public int[] array (int[] nums){
        int n=nums.length;
        int[] ans=new int[n+n];
        for(int i=0;i<n+n;i++){
            ans[i]=nums[i%n];
        }
        return ans;
    }
}