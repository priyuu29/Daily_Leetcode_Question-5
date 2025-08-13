// Last updated: 8/13/2025, 10:25:56 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int in=0;
        // Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[in]=nums[i];
                in++;
            }
            else{
                count++;
            }
        }
        for(int i=nums.length-1;i>=nums.length-count;i--){
            nums[i]=0;
        }
    }
}