package gr.aueb.cf.ch19;

public class DoublyLinkedList<T> {

    private NodeGeneric<T> head;
    private NodeGeneric<T> tail;

    private DoublyLinkedList() {
        head = tail = null;
    }


    /**
     * time complexity -> O(1)
     */
    public void insertFront(T t) {

        NodeGeneric<T> tmp = new NodeGeneric<>();

        tmp.setValue(t);
        tmp.setPrev(null);
        tmp.setNext(head);

        head = tmp;

        if (tmp.getNext() == null) {

            tail = tmp;

        } else {

            tmp.getNext().setPrev(tmp);
        }
    }


    /**
     * time complexity -> O(1)
     */
    public void insertEnd(T t) {

        NodeGeneric<T> tmp = new NodeGeneric<>();

        tmp.setValue(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail = tmp;

        if (tmp.getPrev() == null) {

            head = tmp;

        } else {

            tmp.getPrev().setNext(tmp);

        }
    }

    /**
     * time complexity -> O(1)
     */
    public void deleteFront() {

        if (isEmpty()) return;

        if (head.getNext() == null) {

            head = tail = null;

        } else {

            head = head.getNext();
            head.setPrev(null);

        }
    }


    /**
     * time complexity -> O(1)
     */
    public void deleteEnd() {

        if (isEmpty()) return;

        if (head.getNext() == null) {

            head = tail = null;

        } else {

            tail = tail.getPrev();
            tail.setNext(null);

        }

    }

    /**
     * time complexity -> O(n)
     */
    public NodeGeneric<T> get(T t) {

        for (NodeGeneric<T> n = head; n != null; n = n.getNext()) {
            if (n.getValue().equals(t)) return n;
        }

        return null;
    }


    public void traverse() {

        for (NodeGeneric<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n);
        }
    }




    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }
}
