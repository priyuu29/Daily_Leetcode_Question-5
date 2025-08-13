// Last updated: 8/13/2025, 10:25:37 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return miss(nums);
    }
    public List<Integer> miss (int [] arr){
        List<Integer> ll=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int cor=arr[i]-1;
            if(arr[i]!=arr[cor]){
                swap(arr,i,cor);
            }
            else{
                i++;
            }
        }
        for(int c=0;c<arr.length;c++){
            if(arr[c]!=c+1){
                ll.add(c+1);
            }
        }
        return ll;
    }
    void swap(int [] arr,int f,int c){
        int t=arr[f];
        arr[f]=arr[c];
        arr[c]=t;
    }
}