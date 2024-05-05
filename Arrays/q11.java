// 11.Find the average for even and odd elements. 

 public static void main(String[] args) {
       int arr[]={2,4,6,1,3};
       int ce=0,co=0;
       double sume=0,sumo=0;
       for (int i = 0; i < arr.length; i++) {
          if(arr[i]%2==0){
            ce++;
            sume+=arr[i];
           }
          else{
            co++;
            sumo+=arr[i];
            }}
        System.out.println("even average "+(double)sume/ce+"\nodd average "+(double)sumo/co);
    }
