// 10. Write a method to check if a year is a leap year.
  
   public static boolean leap(int year) {
       if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
           return true;
       return false;
   }
