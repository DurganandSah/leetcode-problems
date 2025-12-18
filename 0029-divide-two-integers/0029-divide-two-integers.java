public class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case: dividend = -2^31, divisor = -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);
        
        // Use long to handle absolute values and avoid overflow
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        long result = 0;
        
        // Perform division using bit manipulation
        while (a >= b) {
            long temp = b;
            long multiple = 1;
            
            // Find the largest multiple of b that fits in a
            while (a >= temp << 1) {
                temp <<= 1;
                multiple <<= 1;
            }
            
            // Subtract and add to result
            a -= temp;
            result += multiple;
        }
        
        // Apply sign and return as int
        return negative ? (int) -result : (int) result;
    }
}