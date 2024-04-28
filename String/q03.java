//3.Determine the number of words in a string.


public static void main(String[] args) {
    String s = "hello world how are you?";
    //1
    String[] words = s.split(" "); 
    int c = words.length;

    System.out.println("The number of words in the string is: " + c);

    //2 
    int len=s.length();
    s=s.replace(" ", "");
    System.out.println("The number of words in the string is: " + (len-s.length()+1));

}
