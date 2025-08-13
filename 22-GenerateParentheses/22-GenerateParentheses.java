// Last updated: 8/13/2025, 10:27:15 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll=new ArrayList<>();
		Parantheses(n,0,0,"",ll);
        return ll;
    }
    public static void Parantheses(int n,int closed,int open,String ans,List<String> ll) {
		if(closed==n && open==n) {
//			System.out.println(ans);
			ll.add(ans);
			return;
		}
		if(open>n || closed>open) {
			return;
		}
		Parantheses(n,closed,open+1,ans+"(",ll);
		Parantheses(n,closed+1,open,ans+")",ll);
	}
}