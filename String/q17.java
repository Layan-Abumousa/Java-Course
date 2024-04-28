//17.Replace one word with another.

public static void main(String[] args) {
    String s = "hi guys how are you" ;
    String s1 = "hi" , s2 ="holaa";
    System.out.println("Before replacing : "+s);

    String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s1)) {
                arr[i] = s2;
            }
        }
        
          s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if (i == arr.length - 1) {
                break;
            }
            s += " ";
        }
        System.out.println("After replacing : "+s);
        
}
