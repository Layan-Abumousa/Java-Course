// 13.Convert all plural words ending with the letter "s" to uppercase.

public static void main(String[] args) {
    String s = "hi guys how are you";
    String arr[] = s.split(" ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].charAt(arr[i].length() - 1) == 's') {
                arr[i] = arr[i].toUpperCase();
            }
        }
        
        System.out.println(Arrays.toString(arr));






}
