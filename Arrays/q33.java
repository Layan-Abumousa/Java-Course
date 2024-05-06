// 33.Write a Java program to find common elements between two integer arrays.

public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6, 7, 9};  
        int[] arr2 = {2, 4, 6, 8, 10};   

        System.out.println("Common elements between the two arrays:");
        boolean common = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    common = true;
                    break; 
                }
            }
        }

        if (!common) {
            System.out.println("No common elements.");
        }
    }
