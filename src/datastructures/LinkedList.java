package datastructures;

import java.io.Serializable;

public class LinkedList<T> implements Serializable {

    private ListNode<T> head;

    public void add(T data) {
        ListNode<T> newNode = new ListNode<>(data);

        //Fall 1: Falls Liste leer
        if (head == null) {
            head = newNode;
            return;
        }

        //Fall 2: ans Ende laufen
        ListNode<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        //Neues Item anhängen
        current.next = newNode;
    }
    //Item entfernen
    public void remove(T data) {
        if (head == null) {
            return;
        }
        //Wenn das erste Item entfernt wird
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        ListNode<T> current = head;
        ListNode<T> previous = null;

        while (current != null) {
            if (head.data.equals(data)) {
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public int size() {
       int count = 0;
       ListNode<T> current = head;

       while (current != null) {
           count++;
           current = current.next;
       }
       return count;
    }

    public void print() {
        ListNode<T> current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
