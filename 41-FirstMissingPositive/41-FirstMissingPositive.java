// Last updated: 8/13/2025, 10:27:05 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        return miss(nums);
    }
    public int miss(int [] nums){
        int i=0;
        while(i<nums.length){
            int correct =nums[i]-1;
            if(nums[i] > 0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int c=0;c<nums.length;c++){
            if(nums[c]!=c+1){
                return c+1;
            }
        }
        return nums.length+1;
    }
    void swap(int[] arr,int f,int c){
        int temp=arr[f];
        arr[f]=arr[c];
        arr[c]=temp;
    }
}