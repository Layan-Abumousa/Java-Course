// 15.Convert all vowels to lowercase and non-vowels to uppercase.

public static void main(String[] args) {
    String s = "hi guys how are you" ,v ="aeoiuAEOIU";
    String res = "";

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (v.indexOf(ch)!=-1) {
            res += Character.toLowerCase(ch);
        } else {
            res += Character.toUpperCase(ch);
        }
    }

    System.out.println("Original string: '" + s + "'");
    System.out.println("Converted string: '" + res + "'");
}
