// Last updated: 8/13/2025, 10:25:20 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        return miss(nums);
    }
    public int[] miss(int [] arr){
        int [] ans={-1,-1};
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
                ans[0]=arr[c];
                ans[1]=c+1;
            }
        }
        return ans;
    }
    void swap(int [] arr,int f,int c){
        int t=arr[f];
        arr[f]=arr[c];
        arr[c]=t;
    }
}