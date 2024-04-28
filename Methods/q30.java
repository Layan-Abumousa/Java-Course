// 30. Implement a recursive Java method to find the length of a given string


public static int lengthOfString(String str) {
        if (str.equals("")) {
            return 0; 
        }
        return 1 + lengthOfString(str.substring(1)); 
    }
