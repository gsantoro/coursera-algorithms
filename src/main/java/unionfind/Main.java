package unionfind;

/**
 * Created by gsantoro on 15/04/15.
 */
public class Main {
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(10);

        uf.union(0, 9);
        uf.union(3, 4);
        uf.union(2, 3);
        uf.union(1, 3);

        System.out.println(String.format("Content: %s", uf));
        System.out.println(String.format("How many components: %d", uf.count()));
        System.out.println(String.format("Which component for 2: %d", uf.find(2)));
    }
}
