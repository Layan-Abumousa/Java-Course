//5. Implement a method to check if a number is prime or not.


public static boolean prime(int n) {
        
        int c = 0; 
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                c++;
            }
       }
        if (c==2) {
            return true;
       }
        return false;
    }
