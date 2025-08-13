// Last updated: 8/13/2025, 10:25:59 AM
class Solution {
    public int missingNumber(int[] nums) {
       return miss(nums);
    }
    public int miss(int [] arr){
        int i=0;
        while(i<arr.length){
            int c=arr[i];
            if(arr[i]<arr.length &&arr[i]!=arr[c]){
                swap(arr,i,c);
            }
            else{
                i++;
            }
        }
        for(int c=0;c<arr.length;c++){
            if(arr[c]!=c){
                return c;
            }
        }
        return arr.length;
    }
    public void swap(int [] arr, int i,int c){
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
    }
}