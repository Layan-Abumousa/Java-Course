// 19. Write a method to merge two arrays.

 public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length]; 
        int pos = 0;

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[pos++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[pos++] = arr2[i];
        }

        return mergedArray;
    }
