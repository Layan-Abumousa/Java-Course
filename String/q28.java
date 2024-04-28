//28.Remove any duplicate characters from the string.


public static void main(String[] args) {
      
         String s = "hihihl";
        String res = "";
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (s.indexOf(letter) != -1) {
                res += letter;
            }
        }
        
        System.out.println(" After removing duplicated characters: "+res);

}
