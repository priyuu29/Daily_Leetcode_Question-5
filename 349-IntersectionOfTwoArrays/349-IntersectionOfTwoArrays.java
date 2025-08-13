// Last updated: 8/13/2025, 10:25:47 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       return into(nums1,nums2);
    }
    int [] into(int [] arr1,int [] arr2){
        List<Integer> ll=new ArrayList<>();
        HashSet<Integer>map=new HashSet<>();
        int c=0;
        for(int k:arr1){
            map.add(k);
        }
        for(int k2:arr2){
            if(map.contains(k2)){
                c++;
                ll.add(k2);
                map.remove(k2);
            }
        }
        int [] ans=new int[c];
        for(int i=0;i<c;i++){
            ans[i]=ll.get(i);
        }
        return ans;
    }
}