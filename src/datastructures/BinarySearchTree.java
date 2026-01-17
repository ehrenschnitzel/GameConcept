package datastructures;
import exceptions.EnemyNotFoundException;

import javax.xml.stream.events.EndElement;
import java.io.Serializable;

public class BinarySearchTree<T extends Comparable<T>> implements Serializable {

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


    public T find(T data) throws EnemyNotFoundException {
        return findRecursive(root, data);
    }

    private T findRecursive(TreeNode<T> current, T data) throws EnemyNotFoundException {
        if (current == null) {
            throw new EnemyNotFoundException(data + " gibt es nicht, versuchs nochmal!");
        }

        int cmp = data.compareTo(current.data);

        if (cmp == 0) {
            return current.data;
        } else if (cmp < 0) {
            return findRecursive(current.left, data);
        } else {
            return findRecursive(current.right, data);
        }
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

