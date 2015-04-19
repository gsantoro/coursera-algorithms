package unionfind.weightedquickunion;

import unionfind.AbstractMain;

import java.io.IOException;

/**
 * Created by gsantoro on 18/04/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        WeightedQuickUnion qf = new WeightedQuickUnion(10);

        AbstractMain main = new AbstractMain();
        main.test(qf);
    }
}
