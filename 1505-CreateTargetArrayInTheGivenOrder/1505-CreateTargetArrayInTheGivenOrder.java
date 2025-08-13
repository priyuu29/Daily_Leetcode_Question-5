// Last updated: 8/13/2025, 10:24:32 AM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
          int n=nums.length;
        int [] ans =new int[n];
        for(int i=0; i<n;i++){
            for(int j=i; j>index[i];j--){
                ans[j]=ans[j-1];
            }
           ans[index[i]]=nums[i];
        }
        return ans;
    }

}