package unionfind;

/**
 * Created by gsantoro on 15/04/15.
 */
public class MainQuickFind {
    public static void main(String[] args) {
        QuickFind qf = new QuickFind(10);

        System.out.println(String.format("Original   : %s", qf));

        qf.union(3, 4);
        System.out.println(String.format("union(3, 4): %s", qf));

        qf.union(3, 8);
        System.out.println(String.format("union(3, 8): %s", qf));

        qf.union(6, 5);
        System.out.println(String.format("union(6, 5): %s", qf));

        qf.union(9, 4);
        System.out.println(String.format("union(9, 4): %s", qf));

        qf.union(2, 1);
        System.out.println(String.format("union(2, 1): %s", qf));

        qf.union(5, 0);
        System.out.println(String.format("union(5, 0): %s", qf));

        qf.union(7, 2);
        System.out.println(String.format("union(7, 2): %s", qf));

        qf.union(6, 1);
        System.out.println(String.format("union(6, 1): %s", qf));

        System.out.println(String.format("How many components: %d", qf.count()));
        System.out.println(String.format("Which component for 2: %d", qf.find(2)));
        System.out.println(String.format("Is 1 connected to 4: %b", qf.connected(1, 4)));
    }
}
