// 9.Print prime elements. 

 public static boolean isPrime(int x) {
           int c = 0 ; 
           for (int i = 1; i <=x; i++) {
               if (x%i==0) {
                   c++;
               }
           }
           return (c==2);
       }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={2,5,2,1};
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i]+ " is prime");
            }
        }
    }

