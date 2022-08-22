package Lesson5DinamicArray;

public class LinkedContainer<E> implements Linked<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public LinkedContainer() {
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<>(null, null, lastNode);
    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E getElementByIndex(int counter) {
        return null;
    }

    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }
    }

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<E> lastNode) {
        this.lastNode = lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
