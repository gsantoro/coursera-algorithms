package unionfind;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gsantoro on 15/04/15.
 */
public class QuickFind {
    protected int[] data;

    public QuickFind(int n) {
        data = new int[n];

        for (int i=0; i < data.length; i++) {
            data[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return data[p] == data[q];
    }

    public void union(int p, int q) {
        int pid = data[p];
        int qid = data[q];

        for (int i=0; i < data.length; i++) {
            if (data[i] == pid) {
                data[i] = qid;
            }
        }
    }

    public int find(int p) {
        return data[p];
    }

    public int count() {
        Set set = new HashSet<Integer>();

        for(int d: data) {
            set.add(d);
        }

        return set.size();
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
