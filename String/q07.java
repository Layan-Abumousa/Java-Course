// 

public static void main(String[] args) {
    String s = "   hello  world,   how are  you?  ";
    int i, a = 0, l = s.length() - 1;
    // reomve spaces from the sides
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                break;
            }
        }
        a = i;

        for (i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                break;
            }
        }
        l = i;
        s = s.substring(a, l + 1);
 
        System.out.println("String after removing extra spaces: \n" + s ) ;
 // remove extra spaces between words
        String res = "";
        int c = 0;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                c++;
                if (c == 1) {
                    res += ch;
                }
            } else {
                res += ch;
                c = 0;
            }
        }

        
    System.out.println("String after removing extra spaces: \n" + "'"+res+"'" ) ;
}
