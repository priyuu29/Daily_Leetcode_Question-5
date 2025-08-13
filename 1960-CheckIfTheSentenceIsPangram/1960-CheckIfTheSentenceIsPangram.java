// Last updated: 8/13/2025, 10:23:50 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        return pan(sentence);
    }
    public boolean pan(String str){
        int [] freq=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                return false;
            }
        }
        return true;
    }
}