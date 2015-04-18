package unionfind;

/**
 * Created by gsantoro on 18/04/15.
 */
public class WeightedQuickUnion {
    protected int[] data;
    protected int[] weight;

    public WeightedQuickUnion(int n) {
        data = new int[n];
        weight = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = i;
            weight[i] = 1;
        }
    }

    private int root(int i) {
        while (data[i] != i) {
            i = data[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int pr = root(p);
        int qr = root(q);

        if (weight[pr] <= weight[qr]) {
            data[pr] = qr;
            weight[qr] += weight[pr];
        }
        else {
            data[qr] = pr;
            weight[pr] += weight[qr];
        }
    }

    public int find(int p) {
        return root(p);
    }

    public int count() {
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == i) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i: data) {
            sb.append(String.format("%d ", i));
        }

        return sb.toString();
    }
}
