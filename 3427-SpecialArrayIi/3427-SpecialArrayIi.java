// Last updated: 8/13/2025, 10:22:48 AM
// class Solution {
//     public boolean[] isArraySpecial(int[] nums, int[][] queries) {
//         boolean [] ans = new boolean[queries.length];
        
//         for(int i=0; i<queries.length;i++){
//             int j=queries[i][0],k=queries[i][1];
//             while(j<k){
//                 if((nums[j]%2)==(nums[j+1]%2)){
//                     ans[i]=false;
//                 }
//                 else 
//                     ans[i]=true;

//                 j++;
//             }
//         }
//         return ans;
        
//     }
// }
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] pre = new int[n]; 
        boolean[] ans = new boolean[queries.length]; 
        
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1];
            if ((nums[i - 1] % 2) == (nums[i] % 2)) {
                pre[i]++;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int j = queries[i][0];
            int k = queries[i][1];
            
            int specialCount = pre[k] - (j > 0 ? pre[j] : 0);
            
            ans[i] = (specialCount == 0);
        }

        return ans;
    }
}