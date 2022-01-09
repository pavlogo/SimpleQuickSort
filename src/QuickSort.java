import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = {100, 777, 44, 199, 119, 55, 88};
        int n = array.length;

        quickSort(array, 0, n - 1);

        System.out.println(Arrays.toString(array));
    }

    static void quickSort(int[] array, int lower, int upper) {

        if (lower < upper) {

            int piv = array[upper];
            int i = (lower - 1);

            for (int j = lower; j <= upper - 1; j++) {
                if (array[j] < piv) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            int temp = array[i + 1];
            array[i + 1] = array[upper];
            array[upper] = temp;

            int pi = (i + 1);

            quickSort(array, lower, pi - 1);
            quickSort(array, pi + 1, upper);
        }
    }
}