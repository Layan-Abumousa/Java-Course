// 22. Java method to reverse the digits of a given number

    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int d = num % 10; 
            reversed = reversed * 10 + d; 
            num /= 10;  
        }
        return reversed;
    }
