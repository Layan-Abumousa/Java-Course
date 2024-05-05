// 7.Find the smallest element. 

public static int findSmallest(int[] arr) {
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  
            }
        }
        return min;
    }
