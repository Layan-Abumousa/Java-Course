// 30.Write a Java program to print unique elements from an array.

public static void printUniqueElements(int[] arr) {
        System.out.println("Unique elements in the array:");

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
