// 4. Create a method to calculate the factorial of a given number.

public static long factorial(int n) {
        
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
