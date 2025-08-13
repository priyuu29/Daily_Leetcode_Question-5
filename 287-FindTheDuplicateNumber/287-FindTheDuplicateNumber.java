// Last updated: 8/13/2025, 10:25:54 AM
class Solution {
    public int findDuplicate(int[] nums) {
        return miss(nums);
    }
    public int miss(int [] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int cor=arr[i]-1;
                if(arr[i]!=arr.length && arr[i]!=arr[cor]){
                    swap(arr,i,cor);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        for(int c=0;c<arr.length;c++){
            if(arr[c]!=c+1){
                return arr[c];
            }
        }
        return arr.length;
    }
    void swap(int [] arr,int f,int c){
        int t=arr[f];
        arr[f]=arr[c];
        arr[c]=t;
    }
}