package datastructures;

public class BinarySearchTree<T extends Comparable<T>> {

    private TreeNode<T> root;

    public void insert(T data) {
        root = insertRecursive(root, data);
    }
    private TreeNode<T> insertRecursive(TreeNode<T> current, T data) {
        if (current == null) {
            return new TreeNode<>(data);
        }
        int cmp = data.compareTo(current.data);

        if (cmp < 0) {
            current.left = insertRecursive(current.left, data);
        } else {
            current.right = insertRecursive(current.right, data);
        }
        return current;
    }


    public T find(T data) {
        // TODO: Rekursiv suchen
        return null;
    }

    public void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(TreeNode<T> current) {
        if (current == null) return;

        printInOrderRecursive(current.left);
        System.out.println(current.data);
        printInOrderRecursive(current.right);
    }
}

