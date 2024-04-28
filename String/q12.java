//12.Swap only vowels.

public static String reverseString(String s ){
    String rev = "";
    for (int i = 0; i < s.length(); i++) {
        rev=s.charAt(i)+rev;
    }
    return rev;
    
}
public static void main(String[] args) {
    String s = "layen";
    String vowels = "aeiou";
    String ab="" ,res="";
    
    for (int i = 0; i < s.length(); i++) {
        if (vowels.indexOf(s.charAt(i))!=-1) {
            ab+=s.charAt(i);
        }
    }
    ab=reverseString(ab);
    int j =0;
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (vowels.indexOf(s.charAt(i))!=-1) {
            res+=ab.charAt(j++);
        }
        else
            res+=ch;
    }
    System.out.println(res);
    
}
