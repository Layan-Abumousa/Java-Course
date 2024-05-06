/* 
34.Write a Java program to print all the LEADERS in the array. 
Note: An element is a leader if it is greater than all the elements to its right side.
*/

  public static void printLeaders(int[] arr) {
        int max = arr[arr.length - 1];  
        System.out.println("Leaders in the array:");

      
        System.out.print(max + " ");

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};  
        printLeaders(arr);
    }
