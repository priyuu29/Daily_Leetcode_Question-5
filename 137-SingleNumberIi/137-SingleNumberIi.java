// Last updated: 8/13/2025, 10:26:34 AM
class Solution {
    public int singleNumber(int[] nums) {
        return find(nums);
    }
    int find(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int e=0;
        for(int k:arr){
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }
            else{
                map.put(k,1);
            }
        }
        for(int key:map.keySet()){
            if((map.get(key))<3){
                e= key;
                break;

            }
        }
        return e;
    }
}