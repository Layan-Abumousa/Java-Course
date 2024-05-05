// 18.Find peak elements (a peak element that is not smaller than its neighbors).

 public static void main(String[] args) {
       int arr[]={2,4,6,1,3,2};
        if (arr[0]>arr[1]) {
            System.out.println(arr[0]+" ");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
                System.out.println(arr[i]+" ");
            }
        }
        if (arr[arr.length-1]>arr[arr.length-2]) {
            System.out.println(arr[arr.length-1]);
        }
       
       
       
       
       
    }
