// Last updated: 8/28/2025, 12:17:51 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<vp>q=new LinkedList<>();
        TreeMap<Integer,List<vp>>map=new TreeMap<>();
        q.add(new vp(root,0,0));
        while(!q.isEmpty()){
            vp v=q.poll();
            // int size=q.size();
            if(!map.containsKey(v.vt)) map.put(v.vt,new ArrayList<>());
            // map.get(get)
            map.get(v.vt).add(v);
            if(v.node.left!=null) q.add(new vp(v.node.left,v.lt+1,v.vt-1));
            if(v.node.right!=null) q.add(new vp(v.node.right,v.lt+1,v.vt+1));
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int key:map.keySet()){
            List<vp>ll=map.get(key);
            Collections.sort(ll,new Comparator<vp>(){
                @Override
                public int compare(vp o1,vp o2){
                    if(o1.lt==o2.lt) return o1.node.val-o2.node.val;
                    return 0;
                }
            });
            List<Integer>li=new ArrayList<>();
            for(vp i:ll){
               li.add(i.node.val);

            }
            ans.add(li);
        }
        return ans;
    }  
}
class vp{
    TreeNode node;
    int lt;//row
    int vt;//col
    public vp(TreeNode node,int lt,int vt){
        this.lt=lt;
        this.vt=vt;
        this.node=node;
    }
}