package sorting;

import static sorting.Sorter.*;

public class QuickSorter implements Sorter {

    private int partition(int[] a, int lo, int hi) {
        int pivot = hi;
        int j = lo;
        while (j < pivot) {
            if (a[j] > a[pivot]) {
                swap(a, j, pivot - 1);
                swap(a, pivot - 1, pivot);
                pivot--;
            } else j++;
        }
        return pivot;
    }

    private void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int p = partition(a, lo, hi);
            quickSort(a, lo, p - 1);
            quickSort(a, p + 1, hi);
        }
    }

    @Override
    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    @Override
    public String toString() {
        return "Quick sorter";
    }

}
