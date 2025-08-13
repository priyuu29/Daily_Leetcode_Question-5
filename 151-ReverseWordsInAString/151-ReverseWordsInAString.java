// Last updated: 8/13/2025, 10:26:31 AM
class Solution {
    public String reverseWords(String s) {
        // String s=" the sky is blue ";
		s=s.trim();
		String [] arr=s.split("\s+");
		String ans=" ";
		for(int i=arr.length-1;i>=0;i--) {
			ans=ans+ arr[i]+ " ";
		}
		return ans.trim();
    }
}