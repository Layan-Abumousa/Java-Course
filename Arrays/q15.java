//15.Find the largest two elements using only one loop. 

public static void findTwoLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;  
        int max2 = Integer.MIN_VALUE;  

       for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;  
                max1 = arr[i]; 
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];  
            }
        }

            System.out.println("The largest element is " + max1 + " and the second largest is " + max2);
        }
