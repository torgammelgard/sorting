package sorting;

public class BubbleSort {

    private static void swap(int[] a, int i, int j) {
        int buff = a[i];
        a[i] = a[j];
        a[j] = buff;
    }

    static void sort(int[] a) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i-1] > a[i]) {
                    swap(a, i, i-1);
                    swapped = true;
                    break;
                }
            }
        }
        while(swapped);
    }
}
