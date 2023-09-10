import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values separated by space: ");
        String values = sc.nextLine();

        // split the values by space and store them in array
        String[] arr = values.split(" ");
        
        // Initialize the LinkedList
        CircularLinkedList<Integer> linkedList = new CircularLinkedList<Integer>();

        for (String value : arr)
            linkedList.addLast(Integer.parseInt(value));

        linkedList.printLinkedList();
        sc.close();
    }
}