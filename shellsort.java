public class shellsort {
    public static void shellSort(int[] array) {
        int gap = array.length / 2;
        while (gap > 0) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
            gap /= 2;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(array);

        shellSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
