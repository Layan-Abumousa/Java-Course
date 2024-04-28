//1.Find the frequency of a character in a string.


public static void main(String[] args) {
    String s = "hello world";
    char ch = 'l';
    int c = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ch) {
            c++;
        }
    }

    System.out.println("The frequency of '" + ch + "' in \"" + s + "\" is: " + c);
}
