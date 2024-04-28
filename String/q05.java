// 5.Count the occurrences of vowel characters and store them in an array.


public static void main(String[] args) {
    String s = "hello world, how are you?";
    int[] v = new int[5]; // Array to store counts for 'a', 'e', 'i', 'o', 'u'

    for (int i = 0; i < s.length(); i++) {
        char c = Character.toLowerCase(s.charAt(i)); // Convert character to lower case to handle upper case vowels
        switch (c) {
            case 'a':
                v[0]++;
                break;
            case 'e':
                v[1]++;
                break;
            case 'i':
                v[2]++;
                break;
            case 'o':
                v[3]++;
                break;
            case 'u':
                v[4]++;
                break;
        }
    }

    System.out.println("Vowel counts:");
    System.out.println("a: " + v[0]);
    System.out.println("e: " + v[1]);
    System.out.println("i: " + v[2]);
    System.out.println("o: " + v[3]);
    System.out.println("u: " + v[4]);
}
