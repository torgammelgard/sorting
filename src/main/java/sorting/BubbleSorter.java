package sorting;

public class BubbleSorter implements Sorter {

    public void sort(int[] a) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i-1] > a[i]) {
                    Sorter.swap(a, i, i-1);
                    swapped = true;
                    break;
                }
            }
        }
        while(swapped);
    }

    @Override
    public String toString() {
        return "Bubble sorter";
    }
}
