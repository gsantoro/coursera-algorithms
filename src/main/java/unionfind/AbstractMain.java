package unionfind;

import utils.StdIn;

import java.io.IOException;

/**
 * Created by gsantoro on 19/04/15.
 */
public class AbstractMain {
    public void test(AbstractQuickFind qf) throws IOException {
        System.out.println(String.format("Original   : %s", qf));

        StdIn stdIn = new StdIn();
        stdIn.init("/quickfind.txt");

        while (!stdIn.isEmpty()) {
            Integer[] line = stdIn.readIntegers();

            qf.union(line[0], line[1]);
            System.out.println(String.format("union(%d, %d): %s", line[0], line[1], qf));
        }

        System.out.println(String.format("How many components: %d", qf.count()));
        System.out.println(String.format("Which component for 2: %d", qf.find(2)));
        System.out.println(String.format("Is 1 connected to 4: %b", qf.connected(1, 4)));
    }
}
