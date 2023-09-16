import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Original Form of String
        DoublyLinkedList<Character> original = new DoublyLinkedList<>();

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++)
            original.addLast(text.charAt(i));

        System.out.print("Original Linked List: ");
        original.printLinkedList();

        // Reversed form of string
        DoublyLinkedList<Character> reversed = new DoublyLinkedList<>();

        for (int i = 0; i < text.length(); i++)
            reversed.addFirst(text.charAt(i));

        System.out.print("Reversed Linked List: ");
        reversed.printLinkedList();

        // create a head node for Original Linked List
        DoublyLinkedList<Character>.Node<Character> currentOriginal = original.head.next;

        // create a head node for Reversed Linked List
        DoublyLinkedList<Character>.Node<Character> currentReversed = reversed.head.next;

        boolean isPalindrome = true;

        do {
            if (currentOriginal.data != currentReversed.data) {
                isPalindrome = false;
                break;
            }

            currentOriginal = currentOriginal.next;
            currentReversed = currentReversed.next;
        } while (currentOriginal.next != null || currentReversed.next != null);

        System.out.println(isPalindrome ? "Yes, it is a palindrome" : "No, it is not a palindrome");
    }
}
