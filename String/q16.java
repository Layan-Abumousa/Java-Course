//16.Convert the first letter of each word to uppercase.


public static void main(String[] args) {
    String s = "hi guys how are you" ;
   String arr[] = s.split(" ");
           System.out.println(" Before converting the first letter of each word to uppercase. : "+s);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i].charAt(0) ^ 32) + arr[i].substring(1);
        }
        
          s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if (i == arr.length - 1) {
                break;
            }
            s += " ";
        }
        System.out.println(" After converting the first letter of each word to uppercase. : "+s);
        
}
