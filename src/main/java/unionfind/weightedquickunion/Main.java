package unionfind.weightedquickunion;

import utils.IOUtils;

import java.io.IOException;

/**
 * Created by gsantoro on 18/04/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        WeightedQuickUnion qu = new WeightedQuickUnion(10);

        System.out.println(String.format("Original   : %s", qu));

        IOUtils utils = new IOUtils();
        String[] lines = utils.getLines("/quickfind.txt");

        int[] edges;
        for(String line: lines) {
            edges = utils.parseLine(line);

            qu.union(edges[0], edges[1]);
            System.out.println(String.format("union(%d, %d): %s", edges[0], edges[1], qu));
        }

        System.out.println(String.format("How many components: %d", qu.count()));
        System.out.println(String.format("Which component for 2: %d", qu.find(2)));
        System.out.println(String.format("Is 1 connected to 4: %b", qu.connected(1, 4)));
    }
}
