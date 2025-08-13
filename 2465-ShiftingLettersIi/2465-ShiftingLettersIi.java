// Last updated: 8/13/2025, 10:23:24 AM
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0], end = shift[1], direction = shift[2];
            diff[start] += direction == 1 ? 1 : -1;
            diff[end + 1] -= direction == 1 ? 1 : -1;
        }

        int currentShift = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            currentShift += diff[i];
            int shifted = (s.charAt(i) - 'a' + currentShift) % 26;
            if (shifted < 0) shifted += 26; 
            result.append((char) ('a' + shifted));
        }

        return result.toString();
    }
}