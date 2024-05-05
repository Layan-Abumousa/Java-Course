// 26.Merge two arrays .
public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];  
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            res[j++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            res[j++] = arr2[i];
        }

        return res;
    }


   public static void main(String[] args) {
        int[] arr1 = {1, 3, 5}; 
        int[] arr2 = {2, 4, 6, 8};  

        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged array:");
       System.out.println(Arrays.toString(mergedArray));
   }
