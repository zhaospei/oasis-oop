public class Solution {
    private int numerator;
    private int denominator = 1;

    /**
     * Get the numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Get the denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Set the numerator.
     * 
     * @param numerator the numerator value.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Set the denominator.
     * 
     * @param denominator the denominator value.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }        
    }

    /**
     * Constructor of the fraction.
     * 
     * @param numerator the numerator value.
     * @param denominator the denominator value.
     */
    Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * Gcd of two integers.
     * 
     * @param a the first integer.
     * @param b the second integer.
     */
    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }

    /**
     * Reduce the fraction.
     */
    public Solution reduce() {
        int gcdd = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / gcdd;
        this.denominator = this.denominator / gcdd;
        return this;
    }

    /**
     * Add two fractions.
     * 
     * @param other the other fraction.
     */
    public Solution add(Solution other) {
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        reduce();
        return this;
    }

    /**
     * Subtract two fractions.
     * 
     * @param other the other fraction.
     */
    public Solution subtract(Solution other) {
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        reduce();
        return this;
    }

    /**
     * Multiply two fractions.
     * 
     * @param other the other fraction.
     */
    public Solution multiply(Solution other) {
        this.numerator = this.numerator * other.numerator; 
        this.denominator = this.denominator * other.denominator;
        reduce();
        return this;
    }

    /**
     * Divide two fractions.
     * 
     * @param other the other fraction.
     */
    public Solution divide(Solution other) {
        if (other.numerator != 0 && other.denominator != 0) {
            this.numerator = this.numerator * other.denominator; 
            this.denominator = this.denominator * other.numerator;
            reduce();
        }
        return this;
    }

    /**
     * Compare two fractions.
     * 
     * @param obj the other fraction.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (this.denominator * other.numerator == this.numerator * other.denominator) {
                return true;
            }
        }
        return false;
    }
}
