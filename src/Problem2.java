import java.util.Scanner;
import java.util.HashSet;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<>(5);
        Stack<Integer> stack2 = new Stack<>(5);

        // Input for Stack1
        System.out.print("Enter 5 values for Stack 1: ");
        for (int i = 0; i < 5; i++)
            stack1.push(sc.nextInt());

        // Input for Stack2
        System.out.print("Enter 5 values for Stack 2: ");
        for (int i = 0; i < 5; i++)
            stack2.push(sc.nextInt());

        // New Stack to store both the stacks
        Stack<Integer> newStack = new Stack<>(stack1.size() + stack2.size());

        // Add the elements of Stack1 to newStack, ignore if it is a duplicate
        for (int i = 0; i < stack1.top + 1; i++)
            newStack.push(stack1.getValue(i));

        // Add the element of Stack2 to newStack, ignore if it is a duplicate
        for (int i = 0; i < stack2.top + 1; i++)
            newStack.push(stack2.getValue(i));

        // Print the new Stack
        newStack.printStack();
        sc.close();
    }
}
