public class CircularLinkedList<E extends Comparable<E>> {
    // Create Node Class
    public class Node<U> {
        public U data;
        public Node<U> next;

        public Node(U data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node<E> tail;        // There is no head since tail is connected back to head
    public int size = 0;

    public CircularLinkedList() {
        this.tail = null;
    }

    public int size() {
        return this.size;       // return the size of the LinkedList
    }

    public boolean isEmpty() {
        return this.size == 0;      // return true if size is 0 (LinkedList is empty)
    }

    public E getFirst() {
        if (isEmpty())
            return null;    // return null if LinkedList is empty
        
        return this.tail.next.data;     // return the value of tail.next (first node)
    }

    public E getLast() {
        if (isEmpty())
            return null;
        
        return this.tail.data;
    }

    public void rotate() {
        if (!isEmpty())
            this.tail = this.tail.next;
    }

    public void addFirst(E data) {
        if (this.size == 0) {
            this.tail = new Node<E>(data);
            this.tail.next = this.tail;
        } else {
            Node<E> node = new Node<E>(data);
            node.next = this.tail.next;
            this.tail.next = node;
        }

        this.size++;
    }

    public void addLast(E data) {
        addFirst(data);
        this.tail = this.tail.next;
        this.size++;
    }

    public E removeFirst() {
        if (isEmpty())
            return null;
        
        Node<E> head = this.tail.next;

        if (head == this.tail)
            this.tail = null;
        else
            this.tail.next = head.next;     // Ignoring head node, directly connecting tail to next node of head
        this.size--;

        return head.data;       // return the value of the node removed
    }

    // FindMax to search the largest item in the Circular Linked List
    public E FindMax() {
        if (this.tail.next == null)
            return null;

        Node<E> current = this.tail.next;
        E max = current.data;

        do {
            if (current.data.compareTo(max) == 1)   // -1 = Lesser, 0 = Equal, 1 = Greater
                max = current.data;
            current = current.next;
        } while (current != this.tail.next);

        return max;
    }

    public void printLinkedList() {
        Node<E> current = this.tail.next;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != this.tail.next);

        System.out.print("\n");
    }
}