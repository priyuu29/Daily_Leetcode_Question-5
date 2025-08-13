// Last updated: 8/13/2025, 10:27:12 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int in=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
                nums[in]=nums[i];
                in++;
            }
        }
        return count;
    }
}