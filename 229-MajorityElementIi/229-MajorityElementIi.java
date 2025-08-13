// Last updated: 8/13/2025, 10:26:13 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return more(nums);

    }
    List<Integer> more(int [] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>ll=new ArrayList<>();
        for(int k:arr){
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }
            else{
                map.put(k,1);
            }
       }
       for(int key:map.keySet()){
            if(map.get(key)>(arr.length/3)){
                ll.add(key);
            }
       }
       return ll;
    }
}