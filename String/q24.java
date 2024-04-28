// 24.Check if it's possible for the string to be a palindrome.

public static void main(String[] args) {
      
         String s = "sjsjj";
       int freq[] = freq(s.toCharArray());
        int odd = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 != 0) {
                odd++;
            }
        }
        if (odd > 1) {
            System.out.println("won't be pal");
        }
        else
            System.out.println("May be Pal");

}
