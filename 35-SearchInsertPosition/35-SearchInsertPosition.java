// Last updated: 8/13/2025, 10:27:08 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        // int idx=0;
        int j=0;
        int k=nums.length-1;
        while(j<=k){
            int mid=j+(k-j)/2;
            if(nums[mid]==target){
                return mid;
                
            }
            else if(nums[mid]>target){
                k=mid-1;
                // idx=k-1;
            }
            else{
                j=mid+1;
                // idx=j+1;
            }
            
        }
        return j;
    }
}