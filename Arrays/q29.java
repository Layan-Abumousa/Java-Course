// 29.Check if the array is increasing or decreasing. 

 public static String increasingOrDecreasing(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                increasing = false;
            }
            if (arr[i] <= arr[i + 1]) {
                decreasing = false;
            }
        }

        if (increasing) {
            return "increasing";
        } else if (decreasing) {
            return "decreasing";
        } else {
            return "neither increasing nor decreasing";
        }
    }
