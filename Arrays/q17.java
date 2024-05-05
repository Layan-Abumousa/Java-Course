// 17.Find the largest two elements using Arrays.sort(arr).

    public static void main(String[] args) {
       int arr[]={2,4,6,1,3};
       Arrays.sort(arr);
        System.out.println("The largest element is " + arr[arr.length-1] + " and the second largest is " +  arr[arr.length-2]);
    }
