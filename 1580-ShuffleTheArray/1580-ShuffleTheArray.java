// Last updated: 8/13/2025, 10:24:20 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        return and(nums,n);
    }
    public int[] and(int [] nums,int n){
        int s=0;
        int c=n;
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i+=2){
            ans[i]=nums[s];
            ans[i+1]=nums[c];
            c++;
            s++;
        }
        return ans;
    }
}