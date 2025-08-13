// Last updated: 8/13/2025, 10:27:23 AM


public class Solution {
   public int lengthOfLongestSubstring(String s) {
       if (s == null || s.length() == 0) {
           return 0;
       }
       
       Set<Character> window = new HashSet<>();
       int left = 0, maxLen = 0;
       
       for (int right = 0; right < s.length(); right++) {
           while (window.contains(s.charAt(right))) {
               window.remove(s.charAt(left));
               left++;
           }
           window.add(s.charAt(right));
           maxLen = Math.max(maxLen, right - left + 1);
       }
       
       return maxLen;
   }
}