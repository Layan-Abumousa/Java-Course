// 8.Print the last word of a string.

public static void main(String[] args) {
    String s = "hello world how are you";
    String ss[] =s.split(" ");
    System.out.println("1 the last word : "+ ss[ss.length-1]);
  
//2
  
  sss = "";
        for (i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i); 
            if (ch == ' ') {
                break;
            }
            sss = ch + s2;
        }
        System.out.println("2 the last word : "+s2);
    
}
