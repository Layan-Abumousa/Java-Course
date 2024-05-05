// 27.Find the length of the longest consecutive increasing elememts .


 public static void main(String[] args) {
        int arr[]={2,5,3,1,3,5,6,7};
        int c=1,max=0;
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]>=arr[i-1])c++;
            else{
            if(c>max){
                max=c;
             }
            c=1;
             }
 
        }
        if(arr[arr.length-1]>arr[arr.length-2]&&c>max)
            max=c;
         System.out.println(max);
   }
