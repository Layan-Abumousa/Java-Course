// 22.Sort the array (even odds).

public static void sortEvenOdds(int arr[]) 
    { 
        for (int i = 0; i <  arr.length - 1; i++) 
            for (int j = 0; j <  arr.length - i - 1; j++) 
                if (arr[j]%2==1 && arr[j + 1]%2!=1) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
    } 

    public static void main(String[] args) {
       int arr[]={1,4,5,2,3,1};
        System.out.println(Arrays.toString(arr));
        sortEvenOdds(arr);
               System.out.println("After sorting "+Arrays.toString(arr));

       
       
       
       
       
    }
