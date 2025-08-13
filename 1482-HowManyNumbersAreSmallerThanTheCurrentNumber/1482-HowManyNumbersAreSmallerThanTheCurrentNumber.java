// Last updated: 8/13/2025, 10:24:38 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        return small(nums);
    }
    public int [] small(int[] nums){
        int [] ans=new int[nums.length];
        int [] s=nums.clone();
        Arrays.sort(s);
        // int i=0;
        // for(int j=0;j<nums.length;j++){
        //     if(nums[i]l==s[j]){
        //         ans[i]=j;
        //     }
        //     if(j==nums.length-1){
        //         j=0;
        //         if(i<nums.length){
        //             i++;
        //         }
        //     }
        // }
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]>nums[j]){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}