//  8.Swap the max element with the min element. 
public static void swapMaxMin(int[] arr) {
        int maxIndex = 0;  // Index of maximum element
        int minIndex = 0;  // Index of minimum element

        // Find indices of the max and min elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap the max and min elements
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }
