// 12.Search for a specific element. 

public static boolean searchElement(int[] arr, int t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                return true;
            }
        }
        return false;  // Return false if the target is not found
    }
