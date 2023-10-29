import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>(1);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of tree: ");
        int size = sc.nextInt();

        System.out.print("Enter the values of nodes: ");
        for (int i = 0; i < size; i++) {
            BinaryTree<Integer> node = new BinaryTree<Integer>(sc.nextInt());
            tree.insert(node);
        }

        tree.inorderTraverse();

        System.out.println("Size of the tree is: " + tree.getSize());
        sc.close();
    }
}