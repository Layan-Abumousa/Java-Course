//19.Print the frequency of each character present in the string.


public static int[] freq(char arr[]){
     int freq[]= new int [26];
     for (int i = 0; i < arr.length; i++) {
         char ch = arr[i];
         freq[(int)(ch-'a')]++;
     }
     
     
     
     
     return freq;
 }
    public static void main(String[] args) {
      
          String s = "layaanooo"  ;     
        int freq[]=freq(s.toCharArray());
        System.out.println(Arrays.toString(freq));
    }

}
