// Last updated: 8/13/2025, 10:24:55 AM
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=0;
        int i=values[0];
        for(int j=1;j<values.length;j++){
            max=Math.max(max,i+values[j]-j);
            i=Math.max(i,values[j]+j);
        }
        return max;
    }
}