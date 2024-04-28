//23.How many characters need to be removed/added to the string to make it apalindrome?


public static void main(String[] args) {
      
         String s = "sjsjjfff";
       int freq[] = freq(s.toCharArray());
        int odd = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 != 0) {
                odd++;
            }
        }
        if (odd>1) {
        System.out.println("Character need to be added or removed " + (odd-1));
        }
        else
            System.out.println("no need");

}
