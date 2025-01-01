package CollectionsFramework.Collection.List.LinkedList;

public class Main {
    public static void main(String[] args) {

        Node<String> head = new Node<>("Tiger");
        Node<String> node1 = new Node<>("Lion");
        Node<String> node2 = new Node<>("Elephant", null);
        head.next = node1;
        node1.next = node2;

        Node<String> temp = head;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

    static class Node<T> {
        T data;
        Node next;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
