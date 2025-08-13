// Last updated: 8/13/2025, 10:24:16 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        return pair(nums);
    }
    public int pair(int[] nums){
        int i=0;
        int j=nums.length-1;
        int c=0;
        while(i<j){
            if(nums[i]==nums[j]){
                c++;
            }
            j--;
            if(j==i){
                j=nums.length-1;
                i++;
            }
        }
        return c;
    }
}
