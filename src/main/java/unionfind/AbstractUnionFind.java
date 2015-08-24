package unionfind;

/**
 * Created by gsantoro on 19/04/15.
 */
public abstract class AbstractUnionFind {
    protected int[] data;

    public abstract boolean connected(int p, int q);

    public abstract void union(int p, int q);

    public abstract int find(int p);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i : data) {
            sb.append(String.format("%d ", i));
        }

        return sb.toString();
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
}
