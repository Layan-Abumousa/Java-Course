// 6. Write a Java method to reverse a given string.


  public static String reverseString(String s) {
        String res ="";
        for (int i = 0; i < s.length(); i++) {
           res=s.charAt(i)+res;
       }
        
            return res;
        }
