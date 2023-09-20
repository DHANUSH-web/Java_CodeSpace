import java.util.Scanner;

class CLLProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList<Integer> nodes = new CircularLinkedList<>();
        
        System.out.print("Enter the size of CLL: ");
        int size = sc.nextInt();

        System.out.print("Enter input for Circular Linked List: ");
        for (int i = 0; i < size; i++)
            nodes.addLast(sc.nextInt());

        // Create two new CLL
        CircularLinkedList<Integer> L = new CircularLinkedList<>();
        CircularLinkedList<Integer> M = new CircularLinkedList<>();

        // Create a head node
        CircularLinkedList<Integer>.Node<Integer> current = nodes.tail.next;

        int pntr = 0;

        do {
            if (pntr++ < size/2)
                L.addLast(current.data);
            else
                M.addLast(current.data);
            
            current = current.next;
        } while (current != nodes.tail.next);

        System.out.print("Circular Linked List L: ");
        L.printLinkedList();

        System.out.print("Circular Linked List M: ");
        M.printLinkedList();
        
        sc.close();
    }
}