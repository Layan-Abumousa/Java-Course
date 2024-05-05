// 14.Print the number of occurrences of a specific element. 

 public static int countOccurrences(int[] arr, int t) {
        int c = 0;
        for (int num : arr) {
            if (num == t) {
                c++;
            }
        }
        return c;
    }
