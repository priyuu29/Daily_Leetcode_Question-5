// Last updated: 8/13/2025, 10:26:02 AM
class Solution {
    public int[] singleNumber(int[] nums) {
        return find(nums);
    }
    int [] find(int arr[]){
        HashMap <Integer,Integer> map=new HashMap<>();
        int ans[]=new int[2];
        int c=0;
        for(int k:arr){
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }
            else{
                map.put(k,1);
            }
        }
        for(int k2:map.keySet()){
            if(map.get(k2)==1){
                ans[c]=k2;
                c++;
            }
        }
        return ans;
    }
}