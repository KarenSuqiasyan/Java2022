package Lesson5DinamicArray;

public class MyLinkList<T> {
    private class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node<T> head = null;

    public int size() {
        Node<T> p;
        int size = 0;
        for (p = head; p != null; p = p.next) {
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }
    public void add(T o) {
        if (isEmpty()) {
            head = new Node<T>(o);
        } else {
            Node<T> p = head;
            Node<T> node = new Node<T>(o);
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
            node.next = null;
        }
    }
    public boolean remove(T o) {
        Node<T> p = head, p1 = null;
        boolean have = false;
        if (isEmpty()) {
            return false;
        }
        while (p != null) {
            if (p.value.equals(o)) {
                if (p1 == null) {
                    head = head.next;
                } else {
                    p1.next = p.next;
                }
                have = true;
            }
            p1 = p;
            p = p.next;
        }
        return have;
    }

    public void printLinkList() {
        Node<T> p;
        for (p = head; p != null; p = p.next) {
            System.out.print(p.value + "--->");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        MyLinkList<String> list = new MyLinkList<String>();
        int[] s = new int[5];
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.remove("7");
        list.printLinkList();
    }
}
