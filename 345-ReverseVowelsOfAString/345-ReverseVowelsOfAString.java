// Last updated: 8/13/2025, 10:25:48 AM
class Solution {
    public String reverseVowels(String s) {
        char [] ch=s.toCharArray();
        return find(ch);
       
    }
    String find(char [] ch){
        int i=0;
        int j=ch.length-1;
        String ans="";
        while(i<j){
            if(!check(ch[i])){
                i++;

                
            }
            if(!check(ch[j])){
                j--;

                
            }
            if(check(ch[i]) && check(ch[j])){
                char ss=ch[i];
                ch[i]=ch[j];
                ch[j]=ss;
                i++;
                j--;
            }

        }
        for(int k=0;k<ch.length;k++){
            ans+=ch[k];
        }

        return ans;
    }
    boolean check(char ch){
        char h=Character.toLowerCase(ch);
        if(h=='a' || h=='i' || h=='e' || h=='o'||h=='u'){
            return true;
        }
        return false;
    }
}