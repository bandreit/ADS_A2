public class BinarySearchTree extends BinaryTreeADT {

    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree(BinaryTreeNode root) {
        super(root);
    }

    public void insert(int element) {
        super.setRoot(insertRecursive(super.getRoot(), element));
    }

    public BinaryTreeNode insertRecursive(BinaryTreeNode root, int value) {
        if (root == null) {
            return new BinaryTreeNode(value);
        }

        if (value < root.getElement()) {
            root.addLeftChild(insertRecursive(root.getLeftChild(), value));
        }

        if (value > root.getElement()) {
            root.addRightChild(insertRecursive(root.getRightChild(), value));
        }

        return root;
    }

    public void removeElement(int element) {

    }

    public int findMin() {
        return -1;
    }

    public int findMax() {
        return -1;
    }

    public void rebalance() {

    }
}
