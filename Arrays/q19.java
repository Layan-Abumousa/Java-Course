// 19.Find the length of the longest consecutive series of odd elements.

public static void main(String[] args) {
       int arr[]={2,4,6,1,3,2};
       int c=0,cmax=0;
       for (int i = 0; i < arr.length; i++) {
 
        if(arr[i]%2!=0)
            c++;
             else{
             if(c>cmax){
              cmax=c;
            }
            c=0;}}
        if(arr[arr.length-1]%2!=0&&c>cmax)
            cmax=c;
        System.out.println(cmax);
       
    }
