// Last updated: 8/13/2025, 10:25:32 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                a=Math.max(a,c);
                c=0;
            }
        }
        return Math.max(a,c);
    }
}