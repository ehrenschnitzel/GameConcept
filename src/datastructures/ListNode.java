package datastructures;

import java.io.Serializable;

public class ListNode<T> implements Serializable {

    T data;
    ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

