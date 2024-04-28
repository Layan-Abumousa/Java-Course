String s = "layan";
String ss = "hi";


// 1. length()
int lengthOfS = s.length();
System.out.println("Length of s: " + lengthOfS);
// Length of s: 5

// 2. charAt()
char charAtIndex2 = s.charAt(2);
System.out.println("Character at index 2 in s: " + charAtIndex2);
// Character at index 2 in s: y

// 3. isEmpty()
boolean isSSempty = ss.isEmpty();
System.out.println("Is ss empty? " + isSSempty);
// Is ss empty? false

// 4. toUpperCase()
String upperCaseS = s.toUpperCase();
System.out.println("Uppercase s: " + upperCaseS);
// Uppercase s: LAYAN

// 5. toLowerCase()
String lowerCaseS = s.toLowerCase();
System.out.println("Lowercase s: " + lowerCaseS);
// Lowercase s: layan

// 6. equals()
boolean areEqual = s.equals(ss);
System.out.println("Are s and ss equal? " + areEqual);
// Are s and ss equal? false

// 7. equalsIgnoreCase()
boolean areEqualIgnoreCase = s.equalsIgnoreCase(ss);
System.out.println("Are s and ss equal ignoring case? " + areEqualIgnoreCase);
// Are s and ss equal ignoring case? false

// 8. indexOf()
int indexOfAInS = s.indexOf('a');
System.out.println("Index of 'a' in s: " + indexOfAInS);
// Index of 'a' in s: 1

// 9. lastIndexOf()
int lastIndexOfAInS = s.lastIndexOf('a');
System.out.println("Last index of 'a' in s: " + lastIndexOfAInS);
// Last index of 'a' in s: 3

// 10. replace()
String replacedString = s.replace('a', 'i');
System.out.println("Replaced string: " + replacedString);
// Replaced string: liyin

// 11. replaceFirst()
String replacedFirstString = s.replaceFirst("a", "i");
System.out.println("Replaced first 'a' in s: " + replacedFirstString);
// Replaced first 'a' in s: liyan

// 12. replaceAll()
String replacedAllString = s.replaceAll("a", "i");
System.out.println("Replaced all 'a's in s: " + replacedAllString);
// Replaced all 'a's in s: liyin

// 13. substring()
String subStringFromIndex2 = s.substring(2);
System.out.println("Substring from index 2 in s: " + subStringFromIndex2);
// Substring from index 2 in s: yan

// 14. split()
String[] splitString = s.split("a");
System.out.println("Splitting s at 'a': ");
for (int i = 0; i < splitString.length; i++) {
System.out.println(splitString[i]);
}
/*
Output:
Splitting s at 'a':
l
y
n
*/

// 15. startsWith()
boolean startsWithHi = ss.startsWith("hi");
System.out.println("Does ss start with 'hi'? " + startsWithHi);
// Does ss start with 'hi'? true

// 16. compareTo()
int comparisonResult = s.compareTo(ss);
System.out.println("Comparison of s and ss: " + comparisonResult);
// Comparison of s and ss: 9

// 17. trim()
String stringWithSpaces = " layan ";
String trimmedString = stringWithSpaces.trim();
System.out.println("Trimmed string: " + trimmedString);
// Trimmed string: layan

// 18. concat()
String concatenatedStrings = s.concat(ss);
System.out.println("Concatenated s and ss: " + concatenatedStrings);
// Concatenated s and ss: layanhi
