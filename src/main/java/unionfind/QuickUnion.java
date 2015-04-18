package unionfind;

/**
 * Created by gsantoro on 16/04/15.
 */
public class QuickUnion {
    protected int[] data;

    public QuickUnion(int n) {
        data = new int[n];

        for (int i=0; i < data.length; i++) {
            data[i] = i;
        }
    }

    protected int root(int p) {
        int i = p;
        while (data[i] != i)
            i = data[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int pr = root(p);
        int qr = root(q);

        data[pr] = qr;
    }

    public int find(int p) {
        return root(p);
    }

    public int count() {
        int count = 0;

        for (int i=0; i < data.length; i++) {
            if (data[i] == i) {
                count++;
            }
        }
        return count;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i: data) {
            sb.append(String.format("%d ", i));
        }

        return sb.toString();
    }
}
