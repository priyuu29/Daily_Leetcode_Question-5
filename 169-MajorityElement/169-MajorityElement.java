// Last updated: 8/13/2025, 10:26:27 AM
class Solution {
    public int majorityElement(int[] nums) {
    	return morevoting(nums);
	}
	public static int morevoting(int [] arr) {
		int e=arr[0];
		int vote=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==e) {
				vote++;
			}
			else {
				vote--;
				if(vote==0) {
					e=arr[i];
					vote=1;
				}
			}
		}
		return e;
	}
}