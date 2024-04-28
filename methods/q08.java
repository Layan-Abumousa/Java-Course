// 8. Create a method to calculate the sum of digits of a given number.

 public static long sumOfDigits(int n) {
       long sum=0;
        while(n!=0){
            int d= n%10;
            sum+=d;
            n/=10;
            
        }
        return sum;
        }
