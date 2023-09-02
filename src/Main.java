import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/*
 * Insert
 * Delete
 * Sort
 * Search
 * Delete Duplicate
 * Exit
 */

class Main {
    public static Scanner sc;
    public static LinkedList<Integer> list;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        boolean running = true;
        int userInput;
        list = generateRandomLinkedList(5);
        traverse(list);

        while (running) {
            displayMenu();

            System.out.print("Enter your choice: ");
            userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    insert();           // Insert
                    traverse(list);
                    break;
                case 2:
                    delete();           // Delete
                    traverse(list);
                    break;
                case 3:
                    sort();             // Sort
                    traverse(list);
                    break;
                case 4:
                    int index = search();       // Search
                    System.out.println(index != -1 ? "Item found at index " + index : "Item cound not be found");
                    traverse(list);
                    break;
                case 5:
                    remove_duplicate(); // Remove Duplicates
                    traverse(list);
                    break;
                case 6:
                    sc.close();
                    System.out.println("Program closed...");
                    running = false;
                    break;
                default:
                    System.out.println("You have entered invalid option...");
            }
        }
    }

    public static LinkedList<Integer> generateRandomLinkedList(int count) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < count; i++)
            list.add(i, random.nextInt(20));

        return list;
    }

    public static void traverse(LinkedList<Integer> list) {
        Iterator<Integer> it = list.iterator();

        while (it.hasNext())
            System.out.print(it.next() + " ");

        System.out.println("\n");
    }

    public static void displayMenu() {
        System.out.println("Menu:\n1. Insert\n2. Delete\n3. Sort\n4. Search\n5. Remove Duplicate\n6. Exit\n");
    }

    // Insert a value
    public static void insert() {
        if (list.size() < 20) {
            System.out.print("Enter a value: ");
            int value = sc.nextInt();
            list.addLast(value);
        }

        else
            System.out.println("LinkedList is full.. please delete some items add new items");
    }

    // Delete a value
    public static void delete() {
        if (list.size() != 0) {
            System.out.print("Enter the index: ");
            int index = sc.nextInt();
    
            if (index == 0)
                list.removeFirst();
            else if (index == list.size() - 1)
                list.removeLast();
            else
                list.remove(index);
        }
        
        else
            System.out.println("LinkedList is empty");
    }

    // Sort the LinkedList
    public static void sort() {
        // Bubble Sort Algorithm
        int size = list.size();

        for (int i = 0; i < size-1; i++)
            for (int j = 0; j < size-i-1; j++)
                if (list.get(j) > list.get(j+1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
    }

    // Search a value and return the index
    public static int search() {
        System.out.print("Please enter the value to search: ");
        int target = sc.nextInt();
        int size = list.size();

        for (int i = 0; i < size / 2; i++) {
            if (list.get(i) == target)
                return i;
            
            if (list.get(size-i-1) == target)
                return size-i-1;
        }

        return -1;
    }

    // Remove duplicate items from the LinkedList
    public static void remove_duplicate() {
        LinkedList<Integer> newList = new LinkedList<>();
        int size = list.size();
        int j = 0;

        sort();     // Sort the LinkedList

        for (int i = 0; i < size-1; i++)
            if (list.get(i) != list.get(i+1))
                newList.add(j++, list.get(i));

        newList.addLast(list.get(size-1));
        list = newList;
    }
}
