package various;

/**
 * Created by gsantoro on 19/05/15.
 */
public class MergeSort {
    public void sort(Comparable[] data) {
        Comparable[] aux = new Comparable[data.length];
        sort(data, aux, 0, data.length - 1);
    }

    private void sort(Comparable[] data, Comparable[] aux, int low, int high) {
        if (low >= high) return;

        int middle = low + (high - low) / 2;
        sort(data, aux, low, middle);
        sort(data, aux, middle+1, high);
        merge(data, aux, low, middle, high);
    }

    private void merge(Comparable[] data, Comparable[] aux, int low, int middle, int high) {
        for (int k=low; k <= high; k++) {
            aux[k] = data[k];
        }

        int i = low;
        int j = middle + 1;
        for (int k = low; k <= high; k++) {
            if (i > middle)
                data[k] = aux[j++];
            else if (j > high)
                data[k] = aux[i++];
            else if (aux[j].compareTo(aux[i]) < 0)
                data[k] = aux[j++];
            else
                data[k] = aux[i++];
        }
    }

    public static void main(String[] args) {
        Integer[] data = new Integer[] { 5, 1, 3, 8, 2 };

        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        MergeSort ms = new MergeSort();
        ms.sort(data);

        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
