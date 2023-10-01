import java.util.Scanner;

class CLLProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList<Integer> nodes = new CircularLinkedList<>();

        System.out.print("Enter the size of CLL: ");
        int size = sc.nextInt();

        System.out.print("Enter the inputs for CLL: ");
        
        for (int i = 0; i < size; i++)
            nodes.addFirst(sc.nextInt());   // addFirst is the best way to reverse Linked List

        System.out.print("The reverse is: ");
        nodes.printLinkedList();
        sc.close();
    }
}