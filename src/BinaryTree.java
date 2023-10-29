class BinaryTree<E extends Comparable<E>> {
    private E data;
    private BinaryTree<E> left;
    private BinaryTree<E> right;
    private int size = 0;

    public BinaryTree(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.size++;
    }

    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public BinaryTree<E> getLeft() {
        return this.left;
    }

    public BinaryTree<E> getRight() {
        return this.right;
    }

    public void setLeft(BinaryTree<E> left) {
        this.left = left;
    }

    public void setRight(BinaryTree<E> right) {
        this.right = right;
    }

    public void insert(BinaryTree<E> node) {
        if (node.data.compareTo(this.data) < 0) {
            if (this.left == null)
                this.left = node;
            else
                this.left.insert(node);
        } else {
            if (this.right == null)
                this.right = node;
            else
                this.right.insert(node);
        }
        this.size++;
    }

    public int getSize() {
        return this.size;
    }

    public void inorderTraverse() {
        if (this.left != null)
            this.left.inorderTraverse();
        
        System.out.println(this.data);

        if (this.right != null)
            this.right.inorderTraverse();
    }
}