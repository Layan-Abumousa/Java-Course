// 7. Develop a method to check if a string is a palindrome.

public static boolean pal(String s) {
        String res ="";
        for (int i = 0; i < s.length(); i++) {
           res=s.charAt(i)+res;
       }
        return s.equals(res);
        }
