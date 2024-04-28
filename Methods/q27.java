// 27. Write a recursive Java method to find the sum of digits of a positive integer.

public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0; 
        }
        return (number % 10) + sumOfDigits(number / 10); 
    }
