//29.Move all vowel characters to the beginning of the string while maintaining their original


public static void main(String[] args) {
      
       String s = "hihihl";
       String v = "aeiou";
       String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if (v.indexOf(ch)!=-1 ){
                res=ch+res;
            }
            else
                res+=ch;
        }
       
        System.out.println(res);
}
