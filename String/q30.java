// 30.Swap the positions of the first and last characters in the string.

public static void main(String[] args) {
      
       String s = "layan";
       s=s.charAt(s.length()-1)+s.substring(1,s.length()-1)+s.charAt(0);
        System.out.println("After swapping the first and the last character "+s);
}
