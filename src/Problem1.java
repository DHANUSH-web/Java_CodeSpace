// Find the common in two stacks
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Problem1 {

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

        // Find the common between two stacks and store in a new stack
        Stack<Integer> commons = findCommon(stack1, stack2);
        commons.printStack();
        sc.close();
    }

    public static Stack<Integer> findCommon(Stack<Integer> stack1, Stack<Integer> stack2) {
        HashSet<Integer> commons = new HashSet<>();
        Stack<Integer> newStack = new Stack<>(stack1.size() + stack2.size());

        for (int i = 0; i < stack1.top + 1; i++)
            commons.add(stack1.getValue(i));

        for (int i = 0; i < stack2.top + 1; i++)
            commons.add(stack2.getValue(i));

        Iterator<Integer> it = commons.iterator();

        while (it.hasNext())
            newStack.push(it.next());

        return newStack;
    }
}
