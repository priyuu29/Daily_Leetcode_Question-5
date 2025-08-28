// Last updated: 8/28/2025, 12:18:53 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        return lc(nums);
    }
    public int lc(int nums[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int key=nums[i];
                int c=0;
                while(set.contains(key)){
                    set.remove(key);
                    c++;
                    key++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}