import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Original Linked List
        CircularLinkedList<Integer> original = new CircularLinkedList<>();

        System.out.print("Enter the values: ");

        for (int i = 0; i < 5; i++)
            original.addLast(sc.nextInt());

        System.out.print("Original Linked List: ");
        original.printLinkedList();

        // Reversed Linked List
        CircularLinkedList<Integer> reversed = new CircularLinkedList<>();

        // Traverse the Original Linked List and add them to the last of reversed Linked List
        CircularLinkedList<Integer>.Node<Integer> current = original.tail.next;

        do {
            reversed.addFirst(current.data);
            current = current.next;
        } while (current != original.tail.next);

        System.out.print("Reversed Linked List: ");
        reversed.printLinkedList();
    }
}
