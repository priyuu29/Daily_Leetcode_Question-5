// Last updated: 8/13/2025, 10:26:38 AM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String>ll=new ArrayList<>();
        Partition(s,ll,ans);
        return ans;
    }
    public static void Partition(String s,List<String>ll,List<List<String>>ans) {
		if(s.length()==0) {
			ans.add(new ArrayList<String>(ll));
			return;
		}
		for(int cut=1;cut<=s.length();cut++) {
			String q=s.substring(0,cut);
			if(isPalindrome(q)==true) {
				ll.add(q);
				Partition(s.substring(cut),ll,ans);		
				ll.remove(ll.size()-1);
			}
		}
	}
	public static boolean isPalindrome(String q) {
		int i=0;
		int j=q.length()-1;
		while(i<j) {
			if(q.charAt(i)!=q.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}