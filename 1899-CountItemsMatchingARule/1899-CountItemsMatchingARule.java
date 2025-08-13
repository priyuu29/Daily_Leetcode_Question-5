// Last updated: 8/13/2025, 10:23:56 AM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j=0;
        int c=0;
        for(int i=0;i<items.size();i++){
            if(ruleKey.equals("type")){
                // j=0;
                if(items.get(i).get(0).equals(ruleValue)){
                    c++;
                }
            }
            if(ruleKey.equals("color")){
                j=1;
                if(items.get(i).get(1).equals(ruleValue)){
                    c++;
                }
            }
            if(ruleKey.equals("name")){
                j=2;
                if(items.get(i).get(2).equals(ruleValue)){
                    c++;
                }
            }
        }
        return c;
    }
}