package Lesson5DinamicArray;

public class DynamicLinkedList<T> {
    private Node head;

    public void add(T data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node nodeToAdd = new Node(data);
            nodeToAdd.next = nodeToAdd;
        }
    }

    @Override
    public String toString() {
        return "DynamicLinkedList{" +
                "head=" + head +
                '}';
    }

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
