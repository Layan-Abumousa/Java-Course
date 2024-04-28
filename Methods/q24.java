// 24. Write a recursive Java method to calculate the factorial of a non-negative integer.

 public static long factorial(int n) {
       
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * factorial(n - 1); 
    }
