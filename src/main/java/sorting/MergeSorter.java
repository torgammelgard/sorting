package sorting;

public class MergeSorter implements Sorter {

    private static void swap(int[] a, int i, int j) {
        int buff = a[i];
        a[i] = a[j];
        a[j] = buff;
    }

    public void sort(int[] a) {
        sort(a, 0, a.length);
    }

    private static void sort(int[] a, int left, int right) {
        if (right - left == 1) return;
        if (right - left == 2) {
            if (a[left] > a[right-1]) {
                swap(a, left, right  - 1);
            }
            return;
        }

        int middle = (left + right) / 2;

        sort(a, left, middle);
        sort(a, middle, right);

        int[] buff = new int[right - left];
        int i = left, j = middle, k = 0;
        while (i < middle && j < right) {
            buff[k++] = (a[i] < a[j]) ? a[i++] : a[j++];
        }
        int index = (i == middle) ? j : i;
        while (k < buff.length) {
            buff[k++] = a[index++];
        }
        k = 0;
        while (k < buff.length) {
            a[left + k] = buff[k++];
        }
    }

    @Override
    public String toString() {
        return "Merge sorter";
    }
}
