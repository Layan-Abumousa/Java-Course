//22.Check if the string is a palindrome.

 public static void main(String[] args) {
      
         String s = "sjs";
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            ss = s.charAt(i) + ss;
        }
        if (s.equals(ss)) {
            System.out.println("Pal");
        }
        else
            System.out.println("Not Pal");

}
