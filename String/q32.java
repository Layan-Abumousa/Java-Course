//32.Swap the positions of the first and last letters of each word in the string

public static void main(String[] args) { 
       String s = "hi hello hola";
       String[] ss=s.split(" ");
       
        for (int i = 0; i < ss.length; i++) {
            ss[i] = ss[i].charAt(ss[i].length() - 1)
                    + ss[i].substring(1, ss[i].length() - 1)
                    + ss[i].charAt(0);
        }
         s = "";
        for (int i = 0; i < ss.length; i++) {
            s += ss[i];
            if (i == ss.length - 1) {
                break;
            }
            s += " ";
        }
        
        System.out.println("after swapping the positions of the first and last letters of each word in the string : "+s);
}
