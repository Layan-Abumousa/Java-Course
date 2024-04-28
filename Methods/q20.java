// 20. Create a method to find the average of elements in an array.

 public static int avg(int[] arr) {
         int sum = 0; 
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
    }
    
    return sum/arr.length ; 
    }
