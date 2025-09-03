// Last updated: 9/3/2025, 12:10:34 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        int g[]=new int[10];
        while(n>0){
            int m=n%10;
            g[m]++;
            n/=10;
        }
        int min=Integer.MAX_VALUE;
        int value=0;
        for(int i=0;i<=g.length-1;i++){
            if(g[i]>0){
                if(g[i]<min || (g[i]==min && i<value)){
                    min=g[i];
                    value=i;
                }
            }
        }
        return value;
    }
}