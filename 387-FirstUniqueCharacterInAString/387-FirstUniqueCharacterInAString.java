// Last updated: 8/13/2025, 10:25:43 AM
class Solution {
    public int firstUniqChar(String s) {
        int [] arr=new int[26];
        for(int j=0;j<s.length();j++){
            arr[(int)s.charAt(j)-(int)'a']++;
        }
        for(int j=0;j<s.length();j++){
            if(arr[(int)s.charAt(j)-(int)'a']==1){
                return j;
            }
        }
        return -1;
    }
}