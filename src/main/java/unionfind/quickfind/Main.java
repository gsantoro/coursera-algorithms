package unionfind.quickfind;

import unionfind.AbstractMain;

import java.io.IOException;

/**
 * Created by gsantoro on 15/04/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        QuickFind qf = new QuickFind(10);

        AbstractMain main = new AbstractMain();
        main.test(qf);
    }
}
