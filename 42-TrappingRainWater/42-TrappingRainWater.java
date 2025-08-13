// Last updated: 8/13/2025, 10:27:04 AM
class Solution {
    public int trap(int[] height) {
		return Trapping(height);
	}
	public static int  Trapping(int[] arr){
		int n=arr.length;
		int [] left=new int [n];
		int [] right=new int [n];
		int sum=0;
		left[0]=arr[0];
		for(int i=1;i<n;i++) {
			left[i]=Math.max(left[i-1],arr[i]);
		}
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		for(int i=0;i<n;i++) {
			sum+=Math.min(left[i], right[i])-arr[i];
		}
		return sum;
	}
}