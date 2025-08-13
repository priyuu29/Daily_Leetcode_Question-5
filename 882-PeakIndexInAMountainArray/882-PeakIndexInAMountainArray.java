// Last updated: 8/13/2025, 10:25:04 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return peak(arr);
    }
    public int peak(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid+1]<arr[mid]){
                end=mid;
                // System.out.printlnt(mid);
            }
            else{
                start=mid+1;
                // return mid;
            }
        }
        return start;
    }
}