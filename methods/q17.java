// 17. Implement a method to find the largest element in an array.

public static int max(int[] arr) {
    int max = arr[0]; 
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>max) {
            max=arr[i];
        }
    }
    
    return max ; 
}
