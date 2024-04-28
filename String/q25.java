// 25.Find the length of the longest palindrome sequence in the string.

public static void main(String[] args) {
      
         String s = "hiihhello";
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i; j < s.length(); j++) {
                String ss = s.substring(i, j + 1);
                if (isPalindorme(ss) && ss.length() > max) {
                    max = ss.length();
                }
            }
        }
        System.out.println("the length of the longest palindrome sequence in the string = " + max);

}
