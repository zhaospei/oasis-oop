public class Solution {
    /**
     * Return the n-th fibonacci number.
     * 
     * @param n the order of the number.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        long fpre = 0;
        long fppre = 1;
        long cur = 0; 
        for (int i = 0; i < n; i++) {
            if (fpre > Long.MAX_VALUE - fppre) {
                return Long.MAX_VALUE;
            }
            cur = fpre + fppre;
            fppre = fpre;
            fpre = cur;
        }
        return cur;
    }
}
