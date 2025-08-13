// Last updated: 8/13/2025, 10:25:44 AM
class Solution {
    public List<Integer> lexicalOrder(int n) {
       List<Integer>ll=new ArrayList<>();
       Print(n,0,ll);
	   return ll; 
    }
   public static void Print(int n,int curr,List<Integer> ll) {
		if(curr>n) {
			return;
		}
		int i=0;
        if(curr!=0){
            // return;
		    ll.add(curr);
        }
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			Print(n,curr*10+i,ll);
		}		
	}
}