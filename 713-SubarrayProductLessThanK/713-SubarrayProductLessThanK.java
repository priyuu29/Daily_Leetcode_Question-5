// Last updated: 8/13/2025, 10:25:16 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         return Product_less_than_K(nums,k);
    }
    public static int Product_less_than_K(int [] arr,int k) {
		int ans=0,si=0,ei=0,p=1;
		while(ei<arr.length) {
//			grow
			p*=arr[ei];
			
//			shrink
			while(p>=k && si<=ei) {
				p/=arr[si];
				si++;
			}
//			 ans update
			ans+=((ei-si)+1);
			ei++;
		}
		return ans;
	}
}