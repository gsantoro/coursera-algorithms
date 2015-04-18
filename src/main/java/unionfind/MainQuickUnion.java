package unionfind;

/**
 * Created by gsantoro on 15/04/15.
 */
public class MainQuickUnion {
    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(10);

        System.out.println(String.format("Original   : %s", qu));

        qu.union(3, 4);
        System.out.println(String.format("union(3, 4): %s", qu));

        qu.union(3, 8);
        System.out.println(String.format("union(3, 8): %s", qu));

        qu.union(6, 5);
        System.out.println(String.format("union(6, 5): %s", qu));

        qu.union(9, 4);
        System.out.println(String.format("union(9, 4): %s", qu));

        qu.union(2, 1);
        System.out.println(String.format("union(2, 1): %s", qu));

        qu.union(5, 0);
        System.out.println(String.format("union(5, 0): %s", qu));

        qu.union(7, 2);
        System.out.println(String.format("union(7, 2): %s", qu));

        qu.union(6, 1);
        System.out.println(String.format("union(6, 1): %s", qu));

        System.out.println(String.format("How many components: %d", qu.count()));
        System.out.println(String.format("Which component for 2: %d", qu.find(2)));
        System.out.println(String.format("Is 1 connected to 4: %b", qu.connected(1, 4)));
    }
}
