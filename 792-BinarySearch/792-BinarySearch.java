// Last updated: 8/13/2025, 10:25:10 AM
class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);
    }
    int binary(int [] arr, int target, int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binary(arr,target,s,mid-1);

        }
        else{
            return binary(arr,target,mid+1,e);
        }
    }
}