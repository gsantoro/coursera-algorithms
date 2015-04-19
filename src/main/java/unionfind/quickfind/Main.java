package unionfind.quickfind;

import utils.IOUtils;

import java.io.IOException;

/**
 * Created by gsantoro on 15/04/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        QuickFind qf = new QuickFind(10);

        System.out.println(String.format("Original   : %s", qf));

        IOUtils utils = new IOUtils();
        String[] lines = utils.getLines("/quickfind.txt");

        int[] edges;
        for(String line: lines) {
            edges = utils.parseLine(line);

            qf.union(edges[0], edges[1]);
            System.out.println(String.format("union(%d, %d): %s", edges[0], edges[1], qf));
        }

        System.out.println(String.format("How many components: %d", qf.count()));
        System.out.println(String.format("Which component for 2: %d", qf.find(2)));
        System.out.println(String.format("Is 1 connected to 4: %b", qf.connected(1, 4)));
    }
}
