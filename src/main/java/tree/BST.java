package tree;

/**
 * Created by gsantoro on 18/05/15.
 */
public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null) return new Node(key, value);

        int cmp = key.compareTo(node.key);

        if (cmp < 0) node.left = put(node.left, key, value);
        else if (cmp > 0) node.right = put(node.right, key, value);
        else node.value = value;

        return node;
    }

    public Value get(Key key) {
        Node node = root;

        while (node != null) {
            int cmp = key.compareTo(node.key);

            if (cmp < 0) node = node.left;
            else if (cmp > 0) node = node.right;
            else return node.value;
        }
        return null;
    }

    public Value min() {
        Node node = root;

        if (node == null) return null;

        while (node.left != null) {
            node = node.left;
        }
        return node.value;
    }

    public Value max() {
        Node node = root;

        if (node == null) return null;

        while (node.right != null) {
            node = node.right;
        }

        return node.value;
    }

    public void delete(Key key) {}

    public Iterable<Key> iterator() { return null; }

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();

            if (left != null)
                sb.append(left.toString());
            else
                sb.append("[");

            sb.append(value);

            if (right != null)
                sb.append(right.toString());
            else
                sb.append("]");

            return sb.toString();
        }
    }

    public String toString() {
        return root.toString();
    }

    public static void main(String[] args) {
        BST<Integer, String> bst = new BST();

        bst.put(24, "Francesco");
        bst.put(59, "Natale");
        bst.put(32, "Giuseppe");
        bst.put(55, "Connie");

        System.out.println(bst);

        String min = bst.min();
        System.out.println(String.format("Minimum: %s", min));

        String max = bst.max();
        System.out.println(String.format("Maximum: %s", max));
    }
}
