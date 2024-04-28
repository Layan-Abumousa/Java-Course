// 16. Write a Java method to find the sum of all elements in an array.


public static int sum(int[] arr) {
    int sum = 0; 
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
    }
    
    return sum ; 
}
