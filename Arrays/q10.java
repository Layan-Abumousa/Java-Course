// 10.Print elements with an even index. 

 public static void main(String[] args) {
        int arr[]={2,5,5,1};
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                System.out.println(arr[i]+ " has an even index");
            }
        }
    }
