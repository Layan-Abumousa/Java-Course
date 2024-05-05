// 24.Rotate the array left.

public static void main(String[] args) {
       int arr[]={1,4,5,2,3,8};
        System.out.println(Arrays.toString(arr));
        int first=arr[0];
        for (int i = 0; i <arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;

        System.out.println("After rotating "+Arrays.toString(arr));

       
       
       
       
       
    }
