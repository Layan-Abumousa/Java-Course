// 4.Count the number of vowel characters excluding 'e' in a string.

public static void main(String[] args) {
    String s = "hello world, how are you?";
    int c = 0;

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u') {
            c++;
        }
    }

    System.out.println("The number of vowels (excluding 'e') in the string is: " + c);
 
    
    //2
    int cc=0;
    String v ="aiou";
    for (int i = 0; i < s.length(); i++) {
        if (v.indexOf(s.charAt(i))!=-1) {
            cc++;
        }
    }
    System.out.println("The number of vowels (excluding 'e') in the string is: " + cc);

  
}
