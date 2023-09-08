public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(1);
        linkedList.addLast(2);

        linkedList.deleteNode(3);
        
        linkedList.printLinkedList();
        System.out.println("Length of Linked List: " + linkedList.size());
    }
}