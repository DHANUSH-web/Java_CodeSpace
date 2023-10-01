class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> nodes = new DoublyLinkedList<>();

        nodes.addLast(100);
        nodes.addLast(80);
        nodes.addLast(40);
        nodes.addLast(10);

        Iterator<Integer> iter = nodes.iterator();

        do {
            System.out.println(iter.next() / 2);
        } while (iter.hasNext());
    }
}