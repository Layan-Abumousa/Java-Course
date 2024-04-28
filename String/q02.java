//2.Calculate the count of characters excluding spaces.


public static void main(String[] args) {
    String s = "hello world";
    int chars = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != ' ') {
            chars++;
        }
    }

    System.out.println("The count of non-space characters in \"" + s + "\" is: " + chars);
}
