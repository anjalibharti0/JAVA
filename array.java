import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class array {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(reader.readLine());
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Array elements:");
        for (int element : array) {
            System.out.println(element);
        }
    }
}
