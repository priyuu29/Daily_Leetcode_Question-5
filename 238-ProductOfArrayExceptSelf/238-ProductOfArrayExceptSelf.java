// Last updated: 8/13/2025, 10:26:07 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
       return prod(nums);
    }
    public static int[] prod(int [] arr){
        int n=arr.length;
        int [] left=new int [n];
        int [] right=new int [n];
        // int [] prod=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i]=left[i]*right[i];
        }   
        return arr;
    }

}