import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        int[] arrayData = { 23, 25, 56, 2, 3, 5, 7, 8, 3, 9, 4 };

        System.out.println("Data Sebelum Di Sorting : ");
        System.out.println(Arrays.toString(arrayData));

        System.out.println("\n------------------------");
        bubbleSort(arrayData);
        System.out.println("Array Setelah Di Sorting : ");
        System.out.println(Arrays.toString(arrayData));

    }
}
