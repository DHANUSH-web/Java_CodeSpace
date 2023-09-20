import java.util.Scanner;

class CLLProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList<Integer> nodes = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> reversed = new DoublyLinkedList<>();  // save the reversed DLL in a new DLL

        System.out.print("Enter the size of Doubly Linked List: ");
        int size = sc.nextInt();

        // Take input for DLL
        System.out.print("Enter the values of DLL: ");
        for (int i = 0; i < size; i++)
            nodes.addLast(sc.nextInt());
        
        // Print only if DLL is not empty else print nothing
        if (!nodes.isEmpty()) {
            // Now reverse the print the value of each node
            DoublyLinkedList<Integer>.Node<Integer> current = nodes.head.next;  // Starting from next node after Head because of prev node

            while (current.next != null) {
                reversed.addFirst(current.data);    // using addFirst is best way to reverse DLL
                current = current.next;
            }

            System.out.print("Printing Nodes after reversing: ");
            reversed.printLinkedList();
        }

        sc.close();
    }
}