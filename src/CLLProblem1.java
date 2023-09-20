import java.util.Scanner;

class CLLProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList<Integer> L = new CircularLinkedList<>();
        CircularLinkedList<Integer> M = new CircularLinkedList<>();

        System.out.print("Enter size of Nodes: ");
        int size = sc.nextInt();

        // Give Input for L
        System.out.print("Enter Input for Circular LinkedList L: ");
        for (int i = 0; i < size; i++)
            L.addLast(sc.nextInt());

        // Give Input for M
        System.out.print("Enter Input for Circular LinkedList M: ");
        for (int i = 0; i < size; i++)
            M.addLast(sc.nextInt());

        String LNode = ConvertToString(L);
        String MNode = ConvertToString(M);

        if (LNode.length() != MNode.length())
            System.out.println("They don't have the same sequence");
        else {
            String node = LNode + LNode;

            if (node.contains(MNode))
                System.out.println("They have same sequence");
            else
                System.out.println("They don't have the same sequence");
        }
        
        sc.close();
    }

    public static String ConvertToString(CircularLinkedList<Integer> nodes) {
        String s = "";

        CircularLinkedList<Integer>.Node<Integer> current = nodes.tail.next;    // Head node

        do {
            s += current.data;
            current = current.next;
        } while (current != nodes.tail.next);

        return s;
    }
}