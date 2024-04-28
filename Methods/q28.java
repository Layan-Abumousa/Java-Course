// 28. Create a recursive Java method to calculate the power of a number (a^b).

public static double power(double a, int b) {
        if (b == 0) {
            return 1; 
        }
       
        return a * power(a, b - 1); 
    }
