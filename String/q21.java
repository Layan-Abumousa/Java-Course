// 21.Find the longest repetition of consecutive characters in the string.


public static void main(String[] args) {
      
         String s = "hiiiiiihhhh";
        int c = 1;
        int longest = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char cch = s.charAt(i + 1);
            if (ch == cch) {
                c++;
            } else {
                if (c > longest) {
                    longest = c;
                }
                c = 1;
            }
        }
        System.out.println("the longest repetition of consecutive characters in the string: " + longest);

}
