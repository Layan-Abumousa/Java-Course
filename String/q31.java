// 31.Swap the positions of the first and last words in the string.

public static void main(String[] args) { 
       String s = "hi hello hola";
       String[] ss=s.split(" ");
       
       String temp = ss[0];
       ss[0]=ss[ss.length-1];
       ss[ss.length-1]=temp;
       
         s = "";
        for (int i = 0; i < ss.length; i++) {
            s += ss[i];
            if (i == ss.length - 1) {
                break;
            }
            s += " ";
        }
        
        System.out.println("after swapping the first and the last words : "+s);
}
