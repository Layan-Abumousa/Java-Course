// 23.Rotate the array right.

 public static void main(String[] args) {
       int arr[]={1,4,5,2,3,8};
        System.out.println(Arrays.toString(arr));
        int last=arr[arr.length-1];
        for (int i = arr.length-1; i >0; i--) {
           arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println("After rotating "+Arrays.toString(arr));

    }
