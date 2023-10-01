class Main {
    public static void main(String[] args) {
        CircularLinkedList<Integer> nodes = new CircularLinkedList<>();
        Queue<Integer> queue = new Queue<>();

        for (int i = 20; i < 25; i++) {
            nodes.addLast(i);
            queue.enqueue(i);
        }

        System.out.print("Linked List: ");
        nodes.printLinkedList();

        System.out.print("Queue: ");
        queue.printQueue();

        System.out.println("Largest Element in Linked List: " + nodes.FindMax());
        System.out.println("Before Rear Element in Queue: " + queue.BeforeRear());
    }
}