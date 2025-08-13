// Last updated: 8/13/2025, 10:24:44 AM
class Solution {
    public int findNumbers(int[] nums) {
        return count(nums);
    }
    public int count(int [] nums){
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                c++;
            }
        }
        return c;
    }
    public boolean even(int num){
        if(num<0){
            num*=-1;
        }
        int eve=(int)(Math.log10(num))+1;
        return eve%2==0;
    }
}