// 25. Implement a recursive Java method to calculate the nth Fibonacci number.

 public static int fibonacci(int n) {
        if (n == 0) return 0; 
        if (n == 1) return 1; 

        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
