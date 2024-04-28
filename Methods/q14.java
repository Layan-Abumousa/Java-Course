// 14. Develop a method to count the occurrences of a specific character in a string.


public static int freqOfChar(String s , char ch ){
    int c = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ch) {
            c++;
        }
    }
  return c ;
}
