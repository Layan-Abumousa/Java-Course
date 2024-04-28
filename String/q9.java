// 9.Print the last two words of a string.

public static void main(String[] args) {
    String s = "hello world how are you";
     int c =1;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)==' ') {
            c++;
        }
    }
     String[] sp= new String[c];
     String word ="";
     int j = 0;
     for (int i = 0; i < s.length(); i++) {
         
         if (s.charAt(i)==' ') {
                 sp[j++]=word;
                 word ="";
         }
         else
         word+=s.charAt(i);

    }
    sp[c-1]=word;    System.out.println("the last two words : "+ sp[sp.length-2] + "  " + sp[sp.length-1]);
    
}
