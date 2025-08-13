// Last updated: 8/13/2025, 10:23:21 AM
class Solution {
    public int mostFrequentEven(int[] nums) {
        if(!check(nums)) return -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                if (map.containsKey(n)) {
                    map.put(n, map.get(n) + 1);
                } else {
                    map.put(n, 1);
                }
            }
        }

        int max = -1;
        int res = -1;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq > max || (freq == max && key < res)) {
                max = freq;
                res = key;
            }
        }
        return res;

    }
    static boolean check(int[] nums){
        for(int num:nums){
            if(num%2==0) return true;
        }
        return false;
    }
}