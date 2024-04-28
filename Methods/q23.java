// 23. Java recursive method to print “hi” n times. 

 public static void printHi(int n) {
        if (n <= 0) {
            return; 
        }
        System.out.println("hi"); 
        printHi(n - 1);
    }
