// Last updated: 8/13/2025, 10:23:46 AM
class Solution {
    final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evens = (n + 1) / 2;  
        long odds = n / 2;        

        long evenChoices = power(5, evens);
        long oddChoices = power(4, odds);

        return (int)((evenChoices * oddChoices) % MOD);
    }

    private long power(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return result;
    }
}
