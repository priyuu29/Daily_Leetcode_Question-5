// Last updated: 10/29/2025, 11:45:19 AM
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        // String ans="";
        int st=(int)Math.pow(10,4);
        long vol=1L*length*width*height;
        long vl=(long)Math.pow(10,9);

        // boolean b = (length >= st || width >= st || height >= st || vol >= vl);
        // boolean h = (mass >= 100);
        if (( (length >= st || width >= st || height >= st || vol >= vl) && mass >= 100)) return "Both";
        else if (length >= st || width >= st || height >= st || vol >= vl) return "Bulky";
        else if (mass >= 100) return "Heavy";
        else return "Neither";
    

        
        // if(b&&h) return "Both";
        // else if(b) return "Bulky";
        // else if(h) return "Heavy";
        // else return "Neither";
    }
}