 public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"  ");
            }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int size=in.nextInt();
        int []arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        
        print(arr);
}
