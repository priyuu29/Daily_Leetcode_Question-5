// Last updated: 10/25/2025, 3:57:02 PM
class Solution {
    public long minCost(int[] nums, int[] cost) {
        return mins(nums,cost);
    }
    long mins(int [] arr,int [] price){
        int s=Arrays.stream(arr).min().getAsInt();
        int e=Arrays.stream(arr).max().getAsInt();

        long ans=0;
        while(s<e){
            int mid=s+(e-s)/2;
            long cost1=get(arr, price,mid);
            long cost2=get(arr, price,mid+1);
            ans=Math.min(cost1,cost2);
            if(cost1<cost2) e=mid;
            else s=mid+1;
        }
        return ans;
    }
    long get(int arr[],int price[],int f){
        long c=0;
        for(int i=0;i<arr.length;i++){
            c+=(long)Math.abs(arr[i]-f)*price[i];
        }
        return c;
    }
}