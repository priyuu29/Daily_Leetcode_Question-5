// Last updated: 8/13/2025, 10:24:28 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int [] b=candies.clone();
        Arrays.sort(b);
        int max=b[b.length-1];
        return hh(candies,extraCandies,max);
    }
    public List<Boolean> hh(int [] candies,int extra,int max){
        List<Boolean> ll=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extra>=max){
                ll.add(i,true);
            }
            else{
                ll.add(i,false);
            }
        }
        return ll;
    }

}