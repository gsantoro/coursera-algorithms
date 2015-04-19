package unionfind.quickunion;

import unionfind.AbstractQuickFind;

/**
 * Created by gsantoro on 16/04/15.
 */
public class QuickUnion extends AbstractQuickFind {
    public QuickUnion(int n) {
        data = new int[n];

        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
    }

    protected int root(int i) {
        while (data[i] != i)
            i = data[i];
        return i;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int pr = root(p);
        int qr = root(q);

        data[pr] = qr;
    }

    @Override
    public int find(int p) {
        return root(p);
    }
}
