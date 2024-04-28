// 29. Create a recursive Java method to compute the GCD (Greatest Common Divisor) of two integers.

 public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); 
    }
