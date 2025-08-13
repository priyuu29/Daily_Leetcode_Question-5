// Last updated: 8/13/2025, 10:22:44 AM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        return xor(nums);
    }
    int xor(int arr[]){
        int a=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int k:arr){
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }
            else{
                 map.put(k,1);
            }
        }
        for(int key:map.keySet()){
            if((map.get(key))==2){
                a^=key;
            }
        }
        return a!=0?a:0;
    }
}