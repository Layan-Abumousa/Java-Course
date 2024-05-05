// 20.Find the length of the longest consecutive series of 1s elements in a binary array.

 public static void main(String[] args) {
       int arr[]={1,0,1,1,1,0,1};
       int c=0,cmax=0;
       for (int i = 0; i < arr.length; i++) {
 
        if(arr[i]==1)
            c++;
             else{
             if(c>cmax){
              cmax=c;
            }
            c=0;}}
        if(arr[arr.length-1]==1&&c>cmax)
            cmax=c;
        System.out.println(cmax);
       
    }
