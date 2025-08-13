// Last updated: 8/13/2025, 10:27:07 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      // TODO Auto-generated method stub
	//    int [] candidate= {2,3,6,7};
	// 	int target=7;
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer> ll=new ArrayList<>();
	//				boolean [] board=new boolean[arr.length-1] ;
		Combination(candidates,target,ll,0,ans);
		// System.out.println(ans);
        return ans;
	}
	public static void Combination(int [] candidates ,int target,List<Integer>ll,int idx,List<List<Integer>>ans) {
		if(target==0) {
//			System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
	
		for(int i=idx;i<candidates.length;i++) {
			if(target>=candidates[i]) {
				ll.add(candidates[i]);
				Combination(candidates,target-candidates[i],ll,i,ans);	
				
				ll.remove(ll.size()-1);
			}
		}
	}
}