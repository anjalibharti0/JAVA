reate and initialize a String and determine the following. (Built in String methods may be used):
a) the length of the string.
b) the number of a’s in the string.
c) convert all lowercase to uppercase and vice versa.
AMITY UNIVERSITY JHARKHAND
d) find if a sub string pattern “abc” is present; if so, display the first position of occurrence.
(Be a





public class StringOperations {
    public static void main(String[] args) {
        // Initialize the string
        String str = "Amity University Jharkhand abcABC";

        // a) Length of the string
        System.out.println("a) Length of the string: " + str.length());

        // b) Number of 'a's in the string (case-insensitive)
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println("b) Number of 'a' or 'A' in the string: " + count);

        // c) Convert lowercase to uppercase and vice versa
        StringBuilder converted = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                converted.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                converted.append(Character.toUpperCase(ch));
            } else {
                converted.append(ch); // keep spaces and others as-is
            }
        }
        System.out.println("c) Case converted string: " + converted.toString());

        // d) Check if substring "abc" is present and its position
        String pattern = "abc";
        int index = str.indexOf(pattern);
        if (index != -1) {
            System.out.println("d) Pattern \"" + pattern + "\" found at index: " + index);
        } else {
            System.out.println("d) Pattern \"" + pattern + "\" not found in the string.");
        }
    }
}
