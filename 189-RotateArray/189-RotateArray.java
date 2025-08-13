// Last updated: 8/13/2025, 10:26:25 AM
class Solution {
    public void rotate(int[] nums, int k) {
		Rotate(nums,k);
		
    }
    public static void Rotate(int[] arr, int k) {
		int n=arr.length;
		k=k%n;
//		starting n-k reverse kro
		Reverse(arr,0,n-k-1);
//		last ke reverse kro
		Reverse(arr,n-k,n-1);
//		all element reverse kro
		Reverse(arr,0,n-1);
	}
	public static void Reverse(int [] arr,int i,int j) {
//		int i=0;
//		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
//			System.out.print(temp +" ");
		}
	}		
}