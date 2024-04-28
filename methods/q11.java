// 11. Develop a method to generate Fibonacci series up to a given number of terms.

 public static void printFibonacci(int terms) {
       
        int t1 = 0, t2=  1;
        System.out.print("Fibonacci Series: " + t1 + " ");
        
            System.out.print(t2 + " ");
            for (int i = 2; i < terms; i++) {
                int next = t1 + t2;
                System.out.print(next + " ");
                t1 = t2; 
                t2 = next; 
            }
        
        System.out.println();
    }
