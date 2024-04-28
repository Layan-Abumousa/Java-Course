// 26. Write a recursive Java method to find the count the digits in a positive integer.

  public static int countDigits(int number) {
       
        if (number == 0) {
            return 0; 
        }
        return 1 + countDigits(number / 10); 
    }
