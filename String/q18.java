// 18.Find the length of the longest word and the shortest word in the string.

public static void main(String[] args) {
   String s = "hi guys how are you" ;
   String arr[] = s.split(" ");
   int min=Integer.MAX_VALUE;
   int max=Integer.MIN_VALUE ;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].length()>max) {
            max=arr[i].length();
        }
        if (arr[i].length()<min) {
            min=arr[i].length();
        }
    }
     
    System.out.println("Length of the longest word : "+ max);
    System.out.println("Length of the shorest word : "+ min);

}
