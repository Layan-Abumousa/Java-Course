//26.Arrange the characters in ascending order.


 public static void main(String[] args) {
      
         String s = "kdbhcja";
         char ch[] = s.toCharArray();
        String ss = "";
        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == i) {
                    ss += s.charAt(j);
                }
            }

        }
        System.out.println("String After sorting the characters "+ss);

}
