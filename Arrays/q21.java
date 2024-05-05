// 21.Swap each pairs. 


    public static void main(String[] args) {
       int arr[]={1,4,5,2,3,1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length -1; i+=2) {
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
               System.out.println("After swapping "+Arrays.toString(arr));

       
    }

