// 14.Convert only plural words ending with the letter "s" to have the first letter uppercase and the rest lowercase.


public static void main(String[] args) {
    String s = "hi guys how are you";
     String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == 's') {
                arr[i] = (char) (arr[i].charAt(0) ^ 32) + arr[i].substring(1);
            }
        }

    System.out.println(Arrays.toString(arr));


}
