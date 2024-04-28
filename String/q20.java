// 20.Print the number of occurrences of words in the string using split.

 public static void main(String[] args) {
      
          String s = "hi hello hola hi hi"  ;     
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            boolean f = true;
            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    f = false;
                    break;
                }
            }
            if (!f) {
                continue;
            }
            
           int c = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[i].equals(arr[k])) {
                    c++;
                }}
            
            System.out.println(arr[i] + ":" + c);
        }

}
