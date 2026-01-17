package datastructures;

import java.io.Serializable;

public class TreeNode<T> implements Serializable {

    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T data) {
        this.data = data;

    }
}