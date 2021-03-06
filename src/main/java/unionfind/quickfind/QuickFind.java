package unionfind.quickfind;

import unionfind.AbstractMain;
import unionfind.AbstractUnionFind;

import java.io.IOException;

/**
 * Created by gsantoro on 15/04/15.
 */
public class QuickFind extends AbstractUnionFind {
    public static void main(String[] args) throws IOException {
        QuickFind qf = new QuickFind(10);

        AbstractMain main = new AbstractMain();
        main.test(qf);
    }

    public QuickFind(int n) {
        data = new int[n];

        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return data[p] == data[q];
    }

    @Override
    public void union(int p, int q) {
        int pid = data[p];
        int qid = data[q];

        for (int i = 0; i < data.length; i++) {
            if (data[i] == pid) {
                data[i] = qid;
            }
        }
    }

    @Override
    public int find(int p) {
        return data[p];
    }
}
