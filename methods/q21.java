// 21. Java method to count the number of digits in a given number

 public static int numOfDigits(int x) {
         int c = 0; 
         while(x!=0){
             c++;
             x/=10;
         }
         return c ;
    }
