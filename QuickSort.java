import java.util.Arrays;

public class QuickSort {
    public static void Qsort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        Qsort(arr, low, e);
        Qsort(arr, s, hi);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        Qsort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }
}