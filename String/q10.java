//10. Rotate right by one character.

public static void main(String[] args) {
    String s = "layan";
     s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
     System.out.println("after rotate right : "+ s );
    
}
