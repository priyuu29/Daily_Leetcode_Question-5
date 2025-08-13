// Last updated: 8/13/2025, 10:25:29 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        
        boolean a = true; 
        if (Character.isUpperCase(word.charAt(0))) {
            if (word.length() > 1 && Character.isLowerCase(word.charAt(1))) {
                a = false; 
            }
        } else {
            a = false; 
        }
        for (int i = 1; i < word.length(); i++) {
            if (!a) { 
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            } else { 
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}