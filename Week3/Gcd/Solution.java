// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * Return gcd of two integers.
     * 
     * @param a the fist integer.
     * @param b the second integer.
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }
} 