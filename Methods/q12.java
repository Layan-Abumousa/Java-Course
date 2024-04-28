// 12. Write a Java method to find the GCD (Greatest Common Divisor) of two numbers.

public static int GCD(int n1, int n2) {
    int gcd = 1;
    for (int i = 1; i <= n1 ; i++) {
        if (n1 % i == 0 && n2 % i == 0) {
            gcd = i;
        }
    }
    return gcd;
}
