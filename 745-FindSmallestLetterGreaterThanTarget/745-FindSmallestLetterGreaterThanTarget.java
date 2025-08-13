// Last updated: 8/13/2025, 10:25:14 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return find(letters,target);
    }
    public char find(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}