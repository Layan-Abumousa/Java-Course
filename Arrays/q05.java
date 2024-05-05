// 5.Reverse the array.

        int arr[]={2,5,2,1};
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
                }
         System.out.println(Arrays.toString(arr));
