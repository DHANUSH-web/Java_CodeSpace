import java.util.Scanner;

public class CLLProblem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Original Form of String
        DoublyLinkedList<Character> original = new DoublyLinkedList<>();

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++)
            original.addLast(text.charAt(i));   // charAt is used to get a character from string using index

        boolean isPalindrome = isPalindrome(original, text);
        System.out.println(isPalindrome);
        sc.close();
    }
    
    public static boolean isPalindrome(DoublyLinkedList<Character> original, String text) {
        // Reversed form of string
        DoublyLinkedList<Character> reversed = new DoublyLinkedList<>();
    
        for (int i = 0; i < text.length(); i++)
            reversed.addFirst(text.charAt(i));
    
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
    
        return isPalindrome;
    }
}
