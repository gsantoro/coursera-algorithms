package unionfind.weightedquickunion;

import unionfind.AbstractUnionFind;

/**
 * Created by gsantoro on 18/04/15.
 */
public class WeightedQuickUnion extends AbstractUnionFind {
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

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int pr = root(p);
        int qr = root(q);

        if (weight[pr] <= weight[qr]) {
            data[pr] = qr;
            weight[qr] += weight[pr];
        } else {
            data[qr] = pr;
            weight[pr] += weight[qr];
        }
    }

    @Override
    public int find(int p) {
        return root(p);
    }
}
