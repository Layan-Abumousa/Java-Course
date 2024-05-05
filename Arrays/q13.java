// 13.Sort array. 

    public static void sortArray(int arr[]) 
    { 
        for (int i = 0; i <  arr.length - 1; i++) 
            for (int j = 0; j <  arr.length - i - 1; j++) 
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
    } 
       
       
    public static void main(String[] args) {
       int arr[]={2,4,6,1,3};
        System.out.println("Before sorting "+Arrays.toString(arr));
        sortArray(arr);
        System.out.println("After sorting "+Arrays.toString(arr));

    }

