import java.io.*;
import java.util.Arrays;

public class strop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Take multiple strings input
        System.out.print("Enter number of strings: ");
        int n = Integer.parseInt(br.readLine());
        String[] strings = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = br.readLine();
        }

        // a. Sort strings in alphabetical order
        Arrays.sort(strings);
        System.out.println("\nSorted Strings in Alphabetical Order:");
        for (String str : strings) {
            System.out.println(str);
        }

        // b. Check whether one string is a substring of another
        System.out.print("\nEnter first string to check substring: ");
        String str1 = br.readLine();
        System.out.print("Enter second string to check against: ");
        String str2 = br.readLine();

        if (str1.contains(str2)) {
            System.out.println("\"" + str2 + "\" is a substring of \"" + str1 + "\"");
        } else if (str2.contains(str1)) {
            System.out.println("\"" + str1 + "\" is a substring of \"" + str2 + "\"");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }

        // c. Convert the strings to uppercase
        System.out.println("\nStrings in Uppercase:");
        for (String str : strings) {
            System.out.println(str.toUpperCase());
        }
    }
}
