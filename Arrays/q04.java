// 4.Check each element whether it's odd or even. 
 public static void oddOrEven(int[]arr){
       int sum = 0; 
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.println(arr[i]+" is even");
            }
            else
                System.out.println(arr[i]+ " is odd");
        }
       
    }
