// 28.Check if the array is palindrome.

 public static boolean isPal(int [] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i]!= arr[arr.length-i-1]) {
                return false;
            }
     }
        return true;
    }
