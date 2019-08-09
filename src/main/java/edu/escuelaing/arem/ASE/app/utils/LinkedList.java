package edu.escuelaing.arem.ASE.app.utils;

public class LinkedList<E> implements List<E> {
    transient int size;
    transient LinkedList.Node<E> first;
    transient LinkedList.Node<E> last;

    public LinkedList() {
        this.size = 0;
    }

    public boolean remove(E data) {
        boolean removed = false;
        LinkedList.Node<E> node = this.first;
        int j;
        for (j = 0; j < this.size && !node.item.equals(data); j++) {
            node = node.next;
        }
        if(j < this.size){
            removeNode(node);
            removed = true;
        }

        return removed;
    }

    public E remove(int i) {
        LinkedList.Node<E> node = findNode(i);
        removeNode(node);

        return node.item;
    }

    public boolean add(E data) {
        return addLast(data);
    }

    public boolean addFirst(E data) {
        if (this.isEmpty()) {
            firstInsertion(data);
        } else {
            LinkedList.Node<E> newFistsNode = new LinkedList.Node<E>(null, data, this.first);
            this.first.prev = newFistsNode;
            this.first = newFistsNode;
            this.size++;
        }

        return true;
    }

    public boolean addLast(E data) {
        if (this.isEmpty()) {
            firstInsertion(data);
        } else {
            LinkedList.Node<E> newLastNode = new LinkedList.Node<E>(this.last, data, null);
            this.last.next = newLastNode;
            this.last = newLastNode;
            this.size++;
        }

        return true;
    }

    public E get(int i) {
        return findNode(i).item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void firstInsertion(E data) {
        LinkedList.Node<E> initialNode = new LinkedList.Node<E>(null, data, null);
        this.last = initialNode;
        this.first = initialNode;
        this.size = 1;
    }

    private LinkedList.Node<E> findNode(int i) {
        validateBounds(i);
        LinkedList.Node<E> node;
        if (i < this.size >> 1) {
            node = this.first;
            for (int j = 0; j != i; j++) {
                node = node.next;
            }
        } else {
            node = this.last;
            for (int j = this.size; j != i; j--) {
                node = node.prev;
            }
        }

        return node;
    }

    private void removeNode(LinkedList.Node<E> nodeToRemove) {
        if(this.size == 1){
            this.first = null;
            this.last = null;
        }
        if(nodeToRemove.prev != null){
            nodeToRemove.prev.next = nodeToRemove.next;
        }
        if(nodeToRemove.next != null){
            nodeToRemove.next.prev = nodeToRemove.prev;
        }
        this.size--;
    }

    private void validateBounds(int i) throws IndexOutOfBoundsException {
        if (i < 0 || this.size <= i) {
            String message = String.format("index out of bound trying to find the position %d in a LinkedList of size %d", i, this.size);
            throw new IndexOutOfBoundsException(message);
        }
    }

    private static class Node<E> {
        E item;
        LinkedList.Node<E> prev;
        LinkedList.Node<E> next;

        Node(LinkedList.Node<E> prev, E item, LinkedList.Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

}
