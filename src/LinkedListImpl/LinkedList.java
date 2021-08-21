package LinkedListImpl;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    public LinkedList insert(int data, LinkedList list) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node traverse = list.head;
            while (traverse.nextNode != null) {
                traverse = traverse.nextNode;
            }
            traverse.nextNode = newNode;
        }

        return list;
    }

    public void printList(LinkedList list) {
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.nextNode;
        }
        System.out.println();
    }

    public LinkedList deleteByKey(LinkedList list, int data) {
        if (list.head != null && list.head.data == data) {
            list.head = list.head.nextNode;
        } else {
            Node previous = list.head;
            Node current = list.head.nextNode;

            while (current != null) {
                if (data == current.data) {
                    previous.nextNode = current.nextNode;
                }
                previous = current;
                current = current.nextNode;
                return list;
            }
            if (current == null) {
                System.out.println("NOT FOUND");
            }

        }
        return list;
    }

    public LinkedList deleteByPosition(LinkedList list, int index) {
        int i = 0;
        if (index == 0 && list.head != null) {
            list.head = list.head.nextNode;

        } else {
            Node previous = list.head;
            Node current = list.head;
            while (current != null && i != index) {
                previous = current;
                current = current.nextNode;
                i++;
            }
            previous.nextNode = current.nextNode;
        }

        return list;
    }

}

