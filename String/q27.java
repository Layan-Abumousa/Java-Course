// 27.Arrange the words in ascending order.


public static void main(String[] args) {
         String s = "cef abc jkl";
        String ss[] = s.split(" ");
        for (int i = 0; i < ss.length - 1; i++) {
            if (ss[i].compareTo(ss[i + 1]) > 0) {
                String temp = ss[i];
                ss[i] = ss[i + 1];
                ss[i + 1] = temp;
                i = -1;
            }
        }
        
        System.out.println(" After sorting the words "+Arrays.toString(ss));

}
